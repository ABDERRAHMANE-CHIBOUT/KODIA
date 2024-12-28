package com.koDea.fixMasterClient.util.navigation



import com.koDea.fixMasterClient.R

sealed class BottomScreenNavigation(val title : String, val selectedIcon : Int, val unselectedIcon : Int,
                                    val route : String) {
    object Home : BottomScreenNavigation(title = "Home" , selectedIcon = R.drawable.filled_home, unselectedIcon = R.drawable.outlined_home , route = Route.HomeScreen.route)
    object Booking : BottomScreenNavigation(title = "Booking" , selectedIcon = R.drawable.filled_booking,unselectedIcon = R.drawable.outlined_booking , route = Route.BookingScreen.route)
    object Settings : BottomScreenNavigation(title = "Settings" , selectedIcon = R.drawable.filled_settings, unselectedIcon = R.drawable.outlined_settings , route = Route.SettingsScreen.route)
    object Search : BottomScreenNavigation(title = "Search" , selectedIcon = R.drawable.filled_search ,unselectedIcon = R.drawable.outlined_search , route = Route.SearchScreen.route)
}