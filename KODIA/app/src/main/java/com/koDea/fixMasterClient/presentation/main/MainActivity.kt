package com.koDea.fixMasterClient.presentation.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.koDea.fixMasterClient.ui.theme.FixMasterTheme
import com.koDea.fixMasterClient.domain.useCases.appEntryUseCases.AppEntryUseCases
import com.koDea.fixMasterClient.util.navigation.Graphs.NavGraph
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    @Inject
    lateinit var useCases: AppEntryUseCases

    private val mainViewModel by viewModels<mainViewModel>()

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // for launch the splash screen
        installSplashScreen().apply {
            // keep on splash screen until the viewModel get the start destination
            setKeepOnScreenCondition {
                mainViewModel.isReady.value
            }
        }

        setContent {
            FixMasterTheme {

                //System ui color settings
                val isInDark = isSystemInDarkTheme()
                val systemController = rememberSystemUiController()
                SideEffect {
                    systemController.setSystemBarsColor(
                        color = Color.Transparent,
                        darkIcons = !isInDark
                    )
                }


                Box(Modifier.background(MaterialTheme.colorScheme.background)) {
                    val startDestination = mainViewModel.startDestination
                    NavGraph(startDestination = startDestination)
                }

            }
        }
    }

}
