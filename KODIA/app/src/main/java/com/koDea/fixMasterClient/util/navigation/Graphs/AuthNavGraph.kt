package com.koDea.fixMasterClient.util.navigation.Graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.koDea.fixMasterClient.presentation.authentification.passwordReset.PasswordReset
import com.koDea.fixMasterClient.presentation.authentification.signIn.SignInScreen
import com.koDea.fixMasterClient.presentation.authentification.signUp.SignUpScreen
import com.koDea.fixMasterClient.util.navigation.Route

fun NavGraphBuilder.AuthNavGraph(navController : NavHostController){
    navigation(
        route = Route.AuthNavigation.route,
        startDestination = Route.SignInScreen.route
    ) {
        composable(route = Route.SignInScreen.route) {
            SignInScreen(navController)
        }
        composable(route = Route.SignUpScreen.route + "/{lat}" + "/{lon}") {
            SignUpScreen(navController)
        }
        composable(route = Route.PasswordReset.route) {
            PasswordReset(navController = navController)
        }
    }
}