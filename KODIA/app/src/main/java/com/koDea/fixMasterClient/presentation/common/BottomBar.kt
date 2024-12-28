package com.koDea.fixMasterClient.presentation.common


import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.koDea.fixMasterClient.util.navigation.BottomScreenNavigation
import com.koDea.fixMasterClient.util.navigation.Route

@Composable
fun BottomBar(navController: NavHostController) {
    val lists = listOf(
        BottomScreenNavigation.Home,
        BottomScreenNavigation.Search,
        BottomScreenNavigation.Booking,
        BottomScreenNavigation.Settings,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarDetination = lists.any { it.route == currentDestination?.route }

    if (bottomBarDetination) {
        NavigationBar(containerColor = MaterialTheme.colorScheme.background) {
            lists.forEach { screen ->
                val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
                NavigationBarItem(
                    selected = selected,
                    onClick = {
                        if (screen.route == BottomScreenNavigation.Search.route){

                        }
                        navController.navigate(if (screen.route == BottomScreenNavigation.Search.route) screen.route + "/ / / " else screen.route){
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    } },
                    icon = { Icon(painter = painterResource(id =  if (selected) screen.selectedIcon else screen.unselectedIcon), contentDescription = screen.title) },
                    label = { Text(text = screen.title , maxLines = 1, overflow = TextOverflow.Ellipsis, fontSize = 12.sp)},
                    colors = NavigationBarItemDefaults.colors(indicatorColor = MaterialTheme.colorScheme.surface)
                    )
            }
        }
    }
}