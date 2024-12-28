package com.koDea.fixMasterClient.util.navigation.Graphs

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.koDea.fixMasterClient.presentation.authentification.passwordReset.PasswordReset
import com.koDea.fixMasterClient.presentation.authentification.signIn.SignInScreen
import com.koDea.fixMasterClient.presentation.authentification.signUp.SignUpScreen
import com.koDea.fixMasterClient.presentation.onBoarding.OnBoardingScreen
import com.koDea.fixMasterClient.util.navigation.BrowseScreen
import com.koDea.fixMasterClient.util.navigation.Route

@Composable
fun NavGraph(startDestination: String) {
    val rootNavController = rememberNavController()
    //val browseNavController = rememberNavController()
    NavHost(navController = rootNavController, startDestination = startDestination  ) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(route = Route.OnBoardingScreen.route) {
                OnBoardingScreen(navController = rootNavController)
            }
        }
        composable(route = Route.BrowseNavigation.route) {
            BrowseScreen(rootNavController = rootNavController)
        }

        AuthNavGraph(rootNavController)
        /*navigation(
            route = Route.AuthNavigation.route,
            startDestination = Route.SignInScreen.route
        ) {
            composable(route = Route.SignInScreen.route) {
                SignInScreen(rootNavController)
            }
            composable(route = Route.SignUpScreen.route + "/{lat}" + "/{lon}") {
                SignUpScreen(rootNavController)
            }
            composable(route = Route.PasswordReset.route) {
                PasswordReset()
            }
        }*/



    }
}