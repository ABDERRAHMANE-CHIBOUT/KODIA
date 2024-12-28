package com.koDea.fixMasterClient.presentation.common

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RichTooltip
import androidx.compose.material3.Text
import androidx.compose.material3.TooltipBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.util.navigation.BottomScreenNavigation
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryItem(
    navController: NavHostController,
    Modifier: Modifier,
    title: String,
    icon: String,
    desc: String
) {

    var showToolTip by remember{ mutableStateOf(false
    ) }

    var scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .width(56.dp)
            .height(72.dp)
            .clickable {
                navController.navigate(BottomScreenNavigation.Search.route + "/$title/Category/ ") {

                }
            }
            .pointerInput(true) {
                detectTapGestures(
                    onLongPress = {
                        showToolTip = true
                        scope.launch {
                            delay(4000)
                            showToolTip = false
                        }
                    },
                    onTap = {
                        navController.navigate(BottomScreenNavigation.Search.route + "/$title/Category/ ") {
                        }
                    })
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            backgroundColor = colorResource(id = R.color.gris),
            shape = CircleShape,
            modifier = Modifier.size(48.dp)
        ) {
            AsyncImage(
                model = icon,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary)

            )

        }
        Text(
            text = title,
            color = if (!isSystemInDarkTheme()) Color.Black else Color.White,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.W500
        )

    }

    AnimatedVisibility(visible = showToolTip) {
        RichTooltip(
            title = { Text(title) },
            text = { Text(desc) },

        )

    }






}