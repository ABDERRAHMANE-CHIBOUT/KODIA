package com.koDea.fixMasterClient.presentation.onBoarding

import android.content.Context
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.onBoarding.component.PageIndicator
import com.koDea.fixMasterClient.presentation.onBoarding.component.onBoardingButton
import com.koDea.fixMasterClient.presentation.onBoarding.component.onBoardingTextButton
import com.koDea.fixMasterClient.presentation.onBoarding.viewModel.onBoardingViewModel
import com.koDea.fixMasterClient.util.navigation.Route
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class, ExperimentalPermissionsApi::class)
@Composable
fun OnBoardingScreen(navController: NavHostController, ViewModel: onBoardingViewModel = hiltViewModel() , context : Context = LocalContext.current) {
    val allocationPermisssionsState = rememberMultiplePermissionsState(permissions = listOf(
        android.Manifest.permission.ACCESS_FINE_LOCATION,
        android.Manifest.permission.ACCESS_COARSE_LOCATION
    ))
    Column((Modifier.fillMaxSize())) {
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }
        val next: String = stringResource(id = R.string.Next)
        val back: String = stringResource(id = R.string.Back)
        val started: String = stringResource(id = R.string.Started)
        val buttonState = remember {
            derivedStateOf {
                when (pagerState.currentPage) {
                    0 -> listOf("", next)
                    1 -> listOf(back, next)
                    2 -> listOf(back, started)
                    else -> listOf("", "")
                }
            }
        }
        HorizontalPager(state = pagerState) { index ->
            onBoardingPage(page = pages.get(index))
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 30.dp)
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PageIndicator(
                modifier = Modifier.width(52.dp),
                selectedPage = pagerState.currentPage,
                pagesSize = pages.size
            )
            Row(verticalAlignment = Alignment.CenterVertically) {

                val scope = rememberCoroutineScope()
                if (buttonState.value[0].isNotEmpty()) {
                    onBoardingTextButton(text = buttonState.value[0],
                        onClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(page = pagerState.currentPage - 1)
                            }

                        }
                    )
                }
                onBoardingButton(onClick = {
                    scope.launch {
                        if (pagerState.currentPage == 2) {
                            ViewModel.saveAppEntry()
                            if (!allocationPermisssionsState.allPermissionsGranted){
                                allocationPermisssionsState.launchMultiplePermissionRequest()
                            }
                            navController.navigate(Route.SignInScreen.route)
                        } else {pagerState.animateScrollToPage(page = pagerState.currentPage + 1)}
                    }
                }, text = "${buttonState.value[1]}")
            }

        }
    }
}
