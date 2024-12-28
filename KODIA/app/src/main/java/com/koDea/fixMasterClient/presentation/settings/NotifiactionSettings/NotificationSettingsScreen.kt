package com.koDea.fixMasterClient.presentation.settings.profile

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import java.util.concurrent.TimeUnit

@Composable
fun NotificationSettingsScreen(context : Context = LocalContext.current){
    Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center){
        PhoneNumberVerificationUI(context = LocalContext.current)
    }
}
@Composable
fun PhoneNumberVerificationUI(context : Context) {
    var phoneNumber by remember { mutableStateOf("") }
    var verificationCode by remember { mutableStateOf("") }
    var statusMessage by remember { mutableStateOf("") }
    var verificationId by remember { mutableStateOf<String?>(null) }

    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center) {
        TextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            label = { Text("Enter phone number") }
        )
        Button(onClick = {
            val callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                override fun onVerificationCompleted(credential: PhoneAuthCredential) {

                    statusMessage = "Verification completed automatically"
                }

                override fun onVerificationFailed(e: FirebaseException) {
                    statusMessage = "Verification failed: ${e.message}"
                }

                override fun onCodeSent(id: String, token: PhoneAuthProvider.ForceResendingToken) {
                    super.onCodeSent(id, token)
                    verificationId = id // Store verification ID
                    statusMessage = "SMS code sent"

                }
            }

            PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phoneNumber,
                60,
                TimeUnit.SECONDS,
                context as Activity,
                callbacks
            )
        }) {
            Text("Send Verification Code")
        }
        val auth = FirebaseAuth.getInstance()
        Spacer(Modifier.height(16.dp))
        TextField(
            value = verificationCode,
            onValueChange = { verificationCode = it },
            label = { Text("Enter Verification Code") }
        )
        Button(onClick = {
            verificationId?.let {
                //verifyPhoneNumberWithCode(it, verificationCode)
                val credential = PhoneAuthProvider.getCredential(it, verificationCode)
                // Normally here you would signInWithPhoneAuthCredential, but since you don't want to sign in, you can just acknowledge verification.
                auth.signInWithCredential(credential).addOnSuccessListener {
                    statusMessage = "Code verified successfully"
                    auth.signOut()
                }.addOnFailureListener {
                    statusMessage = "Code verified unseccess"
                }

            }
        }) {
            Text("Verify Code")
        }
        Text(text = statusMessage)
    }
}



