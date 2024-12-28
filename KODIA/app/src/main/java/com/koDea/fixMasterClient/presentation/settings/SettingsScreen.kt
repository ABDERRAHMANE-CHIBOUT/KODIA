package com.koDea.fixMasterClient.presentation.settings

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.ui.theme.PoppinsFontFamily
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.Route
import kotlinx.coroutines.launch

@Composable
fun SettingsScreen(
    rootNavController: NavHostController,
    browseNavController: NavHostController,
    viewModel: SettingsViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {
    val GeneralSettingsList = listOf(
        SettingsItems.Profile,
        SettingsItems.Account,
        SettingsItems.FavouriteHandyMan,
        SettingsItems.SavedHandyMan,
    )
    val AppSettingslList = listOf(
        SettingsItems.Notification,
        SettingsItems.Language,
        SettingsItems.Theme,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            //.padding(it)
            .background(color = colorResource(id = R.color.lightGray))
    ) {
        HeaderText("General")

        GeneralSettingsList.forEach {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clickable {
                    browseNavController.navigate(it.route)
                }
                .background(MaterialTheme.colorScheme.background),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = it.icon),
                    contentDescription = null,
                    Modifier.padding(8.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(start = 8.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = it.title,
                        textAlign = TextAlign.Start
                    )

                }
                Icon(
                    imageVector = Icons.Filled.ArrowForwardIos,
                    contentDescription = null,
                    Modifier.padding(end = 8.dp)
                )
            }
        }
        HeaderText("App settings")
        AppSettingslList.forEach {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clickable {
                    browseNavController.navigate(it.route)
                }
                .background(MaterialTheme.colorScheme.background),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = it.icon),
                    contentDescription = null,
                    Modifier.padding(8.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .padding(start = 8.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = it.title,
                        textAlign = TextAlign.Start
                    )

                }
                Icon(
                    imageVector = Icons.Filled.ArrowForwardIos,
                    contentDescription = null,
                    Modifier.padding(end = 8.dp)
                )
            }
        }
        var progressState = rememberSaveable {
            mutableStateOf(false)
        }
        val scope = rememberCoroutineScope()
        Button(
            onClick = {
                viewModel.signOut()
                when (val resp = viewModel.signOutState.value) {
                    is Response.onLoading -> {
                        progressState.value = true
                    }

                    is Response.onFaillure -> {
                        Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                    }

                    is Response.onSuccess -> {
                        rootNavController.navigate(Route.AuthNavigation.route) {
                            popUpTo(Route.BrowseNavigation.route) {
                                inclusive = true
                            }
                        }
                    }
                }


            }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 8.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row {
                Text(text = "Log Out")
                if (progressState.value)
                    CircularProgressIndicator()
            }
        }
    }


}

@Composable
fun HeaderText(text : String) {
    Box(modifier = Modifier
        .fillMaxWidth().padding(start = 24.dp)
        .height(48.dp) , contentAlignment = Alignment.CenterStart){
        Text(text = text , fontWeight = FontWeight.SemiBold)
    }
}

sealed class SettingsItems(val title: String, val icon: Int, val route: String) {
    object Profile : SettingsItems(
        "your Profile",
        icon = R.drawable.user_square,
        route = Route.ProfileSettingScreen.route
    )

    object Account : SettingsItems(
        "your Account",
        icon = R.drawable.accountsettings,
        route = Route.AccountScreen.route
    )

    object Language : SettingsItems(
        "Language",
        icon = R.drawable.language,
        route = Route.LanguageScreen.route
    )

    object FavouriteHandyMan : SettingsItems(
        "Favourite HandyMan",
        icon = R.drawable.favourite,
        route = Route.FavouriteHandyManScreen.route
    )

    object SavedHandyMan : SettingsItems(
        "Saved HandyMan",
        icon = R.drawable.outlined_saved_settings,
        route = Route.SavedHandyManScreen.route
    )

    object Theme :
        SettingsItems("Theme", icon = R.drawable.theme, route = Route.ThemeScreen.route)

    object Notification : SettingsItems(
        "Notification",
        icon = R.drawable.notification,
        route = Route.NotificationSettingsScreen.route
    )
}
