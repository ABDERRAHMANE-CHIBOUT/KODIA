package com.koDea.fixMasterClient.presentation.authentification.passwordReset

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.common.OutlinedTextField
import com.koDea.fixMasterClient.util.navigation.Route
import com.onesignal.OneSignal
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

@Composable
fun PasswordReset(context : Context = LocalContext.current , navController : NavHostController){

    val email = rememberSaveable {
        mutableStateOf("")
    }
    var EmailError by rememberSaveable { mutableStateOf(false) }
    var EmailSupportingText = rememberSaveable {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize() , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = email,
            placeHolder = "Email",
            label = "Email",
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.email), contentDescription = null
                )
            },
            trailingIcon = {},
            supportingText = EmailSupportingText
        )

        var progressState by rememberSaveable { mutableStateOf(false) }
        Button(
            onClick = {
                progressState = true
                EmailError = false
                if (email.value.isEmpty()) {
                    EmailError = true
                    EmailSupportingText.value = "Email can't be empty"
                    progressState = false
                }

                if (!EmailError) {
                    val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
                    val auth = FirebaseAuth.getInstance()
                    GlobalScope.launch {
                        try {
                            auth.sendPasswordResetEmail(email.value,).addOnSuccessListener {
                                Toast.makeText(context , "Check your email" , Toast.LENGTH_SHORT).show()
                                navController.navigateUp()
                            }.addOnFailureListener {
                                EmailSupportingText.value = it.localizedMessage?:"error"
                            }.await()

                        }catch (e : Exception){
                            EmailSupportingText.value = e.localizedMessage?:"error"

                        }

                        delay(1000)
                        progressState = false
                    }
                }


                //viewModel.signIn(Email = Email.value , Password = Password.value)
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 24.dp, vertical = 8.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (progressState) {
                    CircularProgressIndicator(
                        color = Color.White,
                        modifier = Modifier
                            .size(26.dp)
                            .fillMaxSize(),
                        strokeWidth = 2.5.dp
                    )
                } else Text(text = "Reset password")
                /*when(val resp = viewModel.signInState.value){
                    is Response.onLoading -> {
                        Toast.makeText(context , "loading" , Toast.LENGTH_SHORT).show()
                        CircularProgressIndicator(color = MaterialTheme.colorScheme.background , modifier = Modifier.size(16.dp))}
                    is Response.onFaillure -> {Toast.makeText(context , "failledToast" , Toast.LENGTH_SHORT).show()}
                    is Response.onSuccess -> {
                        if (resp.data == true){
                            Toast.makeText(context , "resp == true" , Toast.LENGTH_SHORT).show()
                            navController.navigate(Route.BrowseNavigation.route){
                                popUpTo(Route.AuthNavigation.route){
                                    inclusive = true
                                }
                            }
                        }else Toast.makeText(context , "resp == false" , Toast.LENGTH_SHORT).show()

                    }
                }*/
            }

        }
    }
}