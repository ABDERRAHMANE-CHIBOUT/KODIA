package com.koDea.fixMasterClient.util.navigation

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.common.BottomBar
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.util.navigation.Graphs.BrowseNavGraph
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BrowseScreen(
    BrowseNavController: NavHostController = rememberNavController(),
    rootNavController: NavHostController
) {
    val navBackStackEntry by BrowseNavController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    var showLogo by remember {
        mutableStateOf(true)
    }
    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            showLogo = !showLogo
        }
    }
    Scaffold(topBar = {
        TopAppBar(
            title = {
                if (BottomScreenNavigation.Home.route == currentDestination?.route) {
                    AnimatedVisibility(visible = showLogo) {
                        Image(
                            painter = painterResource(id = R.drawable.logotext),
                            contentDescription = "logo",
                            modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(0.5f),
                            alignment = Alignment.CenterStart
                        )
                    }
                    if (!showLogo) {
                        Text(
                            text = "FixMaster",
                            fontFamily = PoppinsFontFamily,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                } else {
                    Text(
                        text = if (currentDestination?.route == Route.ProProfileScreen.route + "/{ID}") "Pro Profile"
                        else if (currentDestination?.route == Route.RequestScreen.route + "/{ID}") "Request"
                        else if (currentDestination?.route == BottomScreenNavigation.Search.route + "/{Category}/{SearchBy}/{OrderBy}") "Search"
                        else if (currentDestination?.route == Route.ChatScreen.route + "/{HandymenID}") "Chat"
                        else if (currentDestination?.route == Route.JobDetailsScreen.route + "/{jobID}") "Job Details"
                        else currentDestination?.route.toString(),
                        fontFamily = PoppinsFontFamily,
                        fontWeight = FontWeight.SemiBold

                    )
                }
            },
            navigationIcon = {
                if (currentDestination?.route != BottomScreenNavigation.Home.route)
                    IconButton(onClick = { BrowseNavController.navigateUp() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                    }
            },
            actions = {
                if (currentDestination?.route == BottomScreenNavigation.Home.route || currentDestination?.route == BottomScreenNavigation.Search.route + "/{Category}/{SearchBy}/{OrderBy}") {
                    IconButton(onClick = {
                        if (currentDestination.route == BottomScreenNavigation.Home.route)
                            BrowseNavController.navigate(Route.NotificationScreen.route)
                        else BrowseNavController.navigate(Route.SearchOnMapScreen.route)
                    }) {
                        Icon(
                            painter = if (currentDestination.route == BottomScreenNavigation.Home.route) painterResource(
                                id = R.drawable.notification
                            ) else painterResource(id = R.drawable.maps_filled),
                            contentDescription = "Notification"
                        )
                    }
                }

            },
        )
    }, bottomBar = {
        BottomBar(BrowseNavController)
    },
        floatingActionButton = {


            val showFloatingActionButton =
                BottomScreenNavigation.Home.route == currentDestination?.route
            if (showFloatingActionButton) {
                FloatingActionButton(onClick = {
                    BrowseNavController.navigate(Route.AddTaskScreen.route) {
                        launchSingleTop = true
                    }
                }) {
                    Icon(imageVector = Icons.Filled.Add, contentDescription = "AddTask")
                }
            }
        }) {
        Box(
            Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            BrowseNavGraph(
                rootNavController = rootNavController,
                BrowseNavController = BrowseNavController
            )
        }
    }
}



