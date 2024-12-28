
package com.koDea.fixMasterClient.util.navigation.Graphs


import JobDetailsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.koDea.fixMasterClient.presentation.CategoryList.CategoryListScreen
import com.koDea.fixMasterClient.presentation.Chat.ChatScreen
import com.koDea.fixMasterClient.presentation.Request.RequestScreen
import com.koDea.fixMasterClient.presentation.SearchOnMap.SearchOnMap
import com.koDea.fixMasterClient.presentation.booking.BookingScreen
import com.koDea.fixMasterClient.presentation.home.HomeScreen

import com.koDea.fixMasterClient.presentation.postTask.AddTaskScreen
import com.koDea.fixMasterClient.presentation.proProfile.ProProfileScreen
import com.koDea.fixMasterClient.presentation.search.SearchScreen
import com.koDea.fixMasterClient.presentation.settings.SettingsScreen
import com.koDea.fixMasterClient.presentation.settings.account.AccountSettingScreen
import com.koDea.fixMasterClient.presentation.settings.favouriteHandyMen.FavouriteHandyMenScreen
import com.koDea.fixMasterClient.presentation.settings.language.LanguageSettingsScreen
import com.koDea.fixMasterClient.presentation.settings.profile.NotificationSettingsScreen
import com.koDea.fixMasterClient.presentation.settings.profile.ProfileSettingsScreen
import com.koDea.fixMasterClient.presentation.settings.profile.SavedHandyManScreen
import com.koDea.fixMasterClient.presentation.settings.profile.ThemeSettingsScreen
import com.koDea.fixMasterClient.util.navigation.Route
import com.koDea.fixMasterClient.presentation.notification.NotificationScreen

@Composable
fun BrowseNavGraph(rootNavController: NavHostController, BrowseNavController: NavHostController) {
    NavHost(
        navController = BrowseNavController,
        route = Route.BrowseNavigation.route,
        startDestination = Route.HomeScreen.route,
    ) {
        composable(route = Route.HomeScreen.route) {
            HomeScreen(navController = BrowseNavController)
        }
        composable(route = Route.BookingScreen.route) {
            BookingScreen(BrowseNavController)
        }
        composable(route = Route.SettingsScreen.route) {
            SettingsScreen(rootNavController, BrowseNavController)
        }
        composable(
            route = Route.SearchScreen.route + "/{Category}/{SearchBy}/{OrderBy}",
            arguments = listOf(navArgument("Category") {
                type = NavType.StringType
            },navArgument("SearchBy") {
                type = NavType.StringType
            },navArgument("OrderBy") {
                type = NavType.StringType
            })
        ) {
            SearchScreen(
                BrowseNavController,
                backStackEntryCategory = it.arguments?.getString("Category"),
                backStackEntrySearchBy = it.arguments?.getString("SearchBy"),
                backStackEntryOrderBy = it.arguments?.getString("OrderBy")
            )
        }
        composable(route = Route.SearchOnMapScreen.route) {
            SearchOnMap(navController = BrowseNavController)
        }
        composable(route = Route.NotificationScreen.route) {
            NotificationScreen(navController = BrowseNavController)
        }
        composable(route = Route.CategoryListScreen.route) {
            CategoryListScreen(navController = BrowseNavController)
        }
        composable(route = Route.ProProfileScreen.route + "/{ID}") {
            ProProfileScreen(navController = BrowseNavController)
        }
        composable(
            route = Route.RequestScreen.route + "/{ID}"
        ) {
            RequestScreen(BrowseNavController)
        }
        composable(
            route = Route.AddTaskScreen.route
        ) {
            AddTaskScreen(BrowseNavController)
        }
        composable(
            route = Route.ProfileSettingScreen.route
        ) {
            ProfileSettingsScreen()
        }
        composable(
            route = Route.AccountScreen.route
        ) {
            AccountSettingScreen()
        }
        composable(
            route = Route.FavouriteHandyManScreen.route
        ) {
            FavouriteHandyMenScreen()
        }
        composable(
            route = Route.SavedHandyManScreen.route
        ) {
            SavedHandyManScreen(browseNavController = BrowseNavController)
        }
        composable(
            route = Route.ThemeScreen.route
        ) {
            ThemeSettingsScreen()
        }
        composable(
            route = Route.LanguageScreen.route
        ) {
            LanguageSettingsScreen()
        }
        composable(
            route = Route.NotificationSettingsScreen.route
        ) {
            NotificationSettingsScreen()
        }
        composable(
            route = Route.JobDetailsScreen.route + "/{jobID}"
        ) {
            JobDetailsScreen(navHostController = BrowseNavController)
        }
        composable(
            route = Route.ChatScreen.route + "/{HandymenID}" , arguments = listOf(navArgument("HandymenID"){type = NavType.StringType})
        ) {
            ChatScreen(HandymenID = it.arguments?.getString("HandymenID")?:"")
        }
    }
}