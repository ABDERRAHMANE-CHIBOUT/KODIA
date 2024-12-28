package com.koDea.fixMasterClient.presentation.Review
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarHalf
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Slider
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import java.math.RoundingMode
import java.text.DecimalFormat


@Composable

@OptIn(ExperimentalMaterial3Api::class)
fun RatingDialog() {
    var openDialog by remember { mutableStateOf(false) }
    var description by remember { mutableStateOf("") }
    var value by remember { mutableStateOf(0F) }

    var handymanId by remember { mutableStateOf("") }
    val db = FirebaseFirestore.getInstance()
    val handymanRef = db.collection("HandyMan").document(handymanId)

    handymanRef.get()
        .addOnSuccessListener { documentSnapshot ->
            if (documentSnapshot != null && documentSnapshot.exists()) {
                val handymanDocumentId = documentSnapshot.id
            } else {
            }
        }
        .addOnFailureListener { e ->
        }


    Column {
        // buuton goes here{
        openDialog = true
         //}

        if (openDialog) {
            AlertDialog(
                onDismissRequest = { openDialog = false },
                title = { Text(text = "Rate your experience:") },
                text = {
                    Column {

                        val random = value
                        val df = DecimalFormat("#.#")
                        df.roundingMode = RoundingMode.DOWN
                        val roundoff = df.format(random)
                        Column( verticalArrangement = Arrangement.Center) {

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
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)}
                                        else if ((roundoff.toDouble() / 10 ) == 0.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)

                                        if ((roundoff.toDouble() / 10 ) >= 2.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)}
                                        else if ((roundoff.toDouble() / 10 ) == 1.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)

                                        if ((roundoff.toDouble() / 10 ) >= 3.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)}
                                        else if ((roundoff.toDouble() / 10 ) == 2.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)

                                        if ((roundoff.toDouble() / 10 ) >= 4.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)}
                                        else if ((roundoff.toDouble() / 10 ) == 3.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)

                                        if ((roundoff.toDouble() / 10 ) >= 5.0) {
                                            Icon(imageVector = Icons.Filled.Star , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)}
                                        else if ((roundoff.toDouble() / 10 ) == 4.5)  Icon(imageVector = Icons.Filled.StarHalf , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)
                                        else     Icon(imageVector = Icons.Filled.StarOutline , contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Yellow)
                                    }
                                }
                            )
                        }


                        Spacer(modifier = Modifier.height(16.dp))
                        TextField(
                            value = description,
                            onValueChange = { description = it },
                            label = { Text("Describe your experience") },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                },
                confirmButton = {
                    Button(onClick = { openDialog = false
                        val user = Firebase.auth.currentUser
                        user?.let {

                            val uid = it.uid
                        val review=Review(value,description,handymanId,uid)}
                    }) {
                        Text(text = "OK")


                    }
                }
            )
        }
    }
}


