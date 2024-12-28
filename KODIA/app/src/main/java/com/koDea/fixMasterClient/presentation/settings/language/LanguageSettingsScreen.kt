package com.koDea.fixMasterClient.presentation.settings.language

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import java.math.RoundingMode
import java.text.DecimalFormat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageSettingsScreen(context : Context = LocalContext.current) {
    var value by remember {
        mutableStateOf(0F)
    }
    val random = value
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    val roundoff = df.format(random)
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text((roundoff.toDouble() / 10).toString())
        Slider(value = value, onValueChange = {
            value = it
        },
            valueRange = 0f..50f,
            steps = 9,
            thumb = {

            },
            track = {
                Row(modifier = Modifier) {
                    if ((roundoff.toDouble() / 10 ) >= 1.0) {
                        Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp))}
                    else if ((roundoff.toDouble() / 10 ) == 0.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp))
                    else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp))

                    if ((roundoff.toDouble() / 10 ) >= 2.0) {
                        Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp))}
                    else if ((roundoff.toDouble() / 10 ) == 1.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp))
                    else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp))

                    if ((roundoff.toDouble() / 10 ) >= 3.0) {
                        Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp))}
                    else if ((roundoff.toDouble() / 10 ) == 2.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp))
                    else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp))

                    if ((roundoff.toDouble() / 10 ) >= 4.0) {
                        Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp))}
                    else if ((roundoff.toDouble() / 10 ) == 3.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp))
                    else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp))

                    if ((roundoff.toDouble() / 10 ) >= 5.0) {
                        Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp))}
                    else if ((roundoff.toDouble() / 10 ) == 4.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp))
                    else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp))


                }
            }
        )
    }
}