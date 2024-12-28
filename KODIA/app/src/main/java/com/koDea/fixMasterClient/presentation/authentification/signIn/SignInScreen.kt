package com.koDea.fixMasterClient.presentation.authentification.signIn

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.repeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Source
import com.google.firebase.messaging.FirebaseMessaging
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.authentification.common.ErrorDialog
import com.koDea.fixMasterClient.presentation.common.OutlinedTextField
import com.koDea.fixMasterClient.util.navigation.Route
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


@OptIn(DelicateCoroutinesApi::class)
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SignInScreen(
    navController: NavHostController,
    viewModel: SignInViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {
    var locationInfo: Location? = null
    val locationClient = remember { LocationServices.getFusedLocationProviderClient(context) }
    val scope = rememberCoroutineScope()


    var locationRequired: Boolean = false
    val permissions = arrayOf(
        android.Manifest.permission.ACCESS_FINE_LOCATION,
        android.Manifest.permission.ACCESS_COARSE_LOCATION
    )

    val launcherMultiplePermissions =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.RequestMultiplePermissions()) { permissionMaps ->
            val areGaranted = permissionMaps.values.reduce { acc, b -> acc && b }
            if (areGaranted) {
                locationRequired = true
                Toast.makeText(context, "permission garanted", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(context, "permission deneid", Toast.LENGTH_LONG).show()
            }
        }

    var openConfirmDialog by remember {
        mutableStateOf(false)
    }
    var dialogTitle by rememberSaveable {
        mutableStateOf("Sign in failled")
    }
    var dialogText by rememberSaveable {
        mutableStateOf("")
    }
    when (openConfirmDialog) {
        true -> ErrorDialog(
            onDismissRequest = { openConfirmDialog = false },
            onConfirmation = { openConfirmDialog = false },
            dialogTitle = dialogTitle,
            dialogText = dialogText,
            icon = Icons.Filled.Error
        )

        else -> true
    }




    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = stringResource(id = R.string.SignIn),
            fontSize = 40.sp,
            color = if (isSystemInDarkTheme()) Color.White else Color.Black,
            modifier = Modifier.padding(top = 48.dp)
        )

        Text(
            text = stringResource(id = R.string.WelcomeBack),
            color = if (isSystemInDarkTheme()) Color.White else Color.Black,
            modifier = Modifier.padding(bottom = 24.dp, top = 12.dp, start = 24.dp, end = 24.dp),
            textAlign = TextAlign.Center

        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
                .padding(top = 36.dp)
        ) {
            var Email = rememberSaveable { mutableStateOf("") }
            var EmailError by rememberSaveable { mutableStateOf(false) }
            var EmailSupportingText = rememberSaveable {
                mutableStateOf("")
            }
            val shakeOffsetEmail = remember { Animatable(0f) }
            val shakeOffsetPassword = remember { Animatable(0f) }
            val coroutineScope = rememberCoroutineScope()
            OutlinedTextField(
                value = Email,
                placeHolder = "Email",
                label = "Email",
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.email), contentDescription = null
                    )
                },
                trailingIcon = {},
                supportingText = EmailSupportingText,
                modifier = Modifier
                    .offset { IntOffset(shakeOffsetEmail.value.dp.roundToPx(), 0) }
            )
            var Password = rememberSaveable {
                mutableStateOf("")
            }
            var PasswordVisibility by remember {
                mutableStateOf(false)
            }
            var PasswordError by rememberSaveable { mutableStateOf(false) }
            var PasswordSupprtingText = rememberSaveable { mutableStateOf("") }


            OutlinedTextField(
                value = Password,
                placeHolder = "Password",
                label = "Password",
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    IconButton(onClick = { PasswordVisibility = !PasswordVisibility }) {
                        Icon(
                            imageVector = if (!PasswordVisibility) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                            contentDescription = null
                        )
                    }
                },
                visualTransformation = if (!PasswordVisibility) PasswordVisualTransformation() else VisualTransformation.None,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                supportingText = PasswordSupprtingText,
                modifier = Modifier
                    .offset { IntOffset(shakeOffsetPassword.value.dp.roundToPx(), 0) }
            )
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(end = 16.dp), contentAlignment = Alignment.CenterEnd
            ) {
                Text(text = stringResource(id = R.string.ForgotPassword),
                    textAlign = TextAlign.Right,
                    modifier = Modifier.clickable {
                        navController.navigate(Route.PasswordReset.route)
                    })
            }
            var progressState by rememberSaveable { mutableStateOf(false) }
            Button(
                onClick = {
                    progressState = true
                    EmailError = false
                    PasswordError = false
                    if (Email.value.isEmpty()) {
                        EmailError = true
                        EmailSupportingText.value = "Email can't be empty"
                        progressState = false
                        coroutineScope.launch {
                            shakeOffsetEmail.animateTo(
                                targetValue = 10f,
                                animationSpec = repeatable(
                                    iterations = 6,
                                    animation = tween(50, easing = FastOutLinearInEasing),
                                    repeatMode = RepeatMode.Reverse
                                )
                            )
                            shakeOffsetEmail.snapTo(0f) // Reset to original position
                        }
                    }
                    if (Password.value.isEmpty()) {
                        PasswordError = true
                        PasswordSupprtingText.value = "Password can't be empty"
                        progressState = false
                        coroutineScope.launch {
                            shakeOffsetPassword.animateTo(
                                targetValue = 10f,
                                animationSpec = repeatable(
                                    iterations = 6,
                                    animation = tween(50, easing = FastOutLinearInEasing),
                                    repeatMode = RepeatMode.Reverse
                                )
                            )
                            shakeOffsetPassword.snapTo(0f) // Reset to original position
                        }

                    } else {
                        if (Password.value.length < 8) {
                            PasswordError = true
                            progressState = false
                            PasswordSupprtingText.value =
                                "Password length should be more than 8 caractere"
                            coroutineScope.launch {
                                shakeOffsetPassword.animateTo(
                                    targetValue = 10f,
                                    animationSpec = repeatable(
                                        iterations = 6,
                                        animation = tween(50, easing = FastOutLinearInEasing),
                                        repeatMode = RepeatMode.Reverse
                                    )
                                )
                                shakeOffsetPassword.snapTo(0f) // Reset to original position
                            }
                        } else {
                            PasswordError = false
                        }
                    }
                    if (!EmailError && !PasswordError) {
                        val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
                        val auth = FirebaseAuth.getInstance()
                        GlobalScope.launch {
                            firestore.collection("Clients").whereEqualTo("Email", Email.value)
                                .get(Source.SERVER)
                                .addOnSuccessListener {
                                    if (it.documents.isNotEmpty()) {
                                        auth.signInWithEmailAndPassword(Email.value, Password.value)
                                            .addOnSuccessListener { auth ->
                                                firestore.collection("Clients")
                                                    .document(auth.user!!.uid).update(
                                                    "DeviceToken",
                                                    OneSignal.User.pushSubscription.id
                                                ).addOnSuccessListener {
                                                    Toast.makeText(
                                                        context,
                                                        OneSignal.User.pushSubscription.id,
                                                        Toast.LENGTH_SHORT
                                                    ).show()

                                                }

                                                //progressState = false
                                                navController.navigate(Route.BrowseNavigation.route) {
                                                    popUpTo(Route.AuthNavigation.route) {
                                                        inclusive = true
                                                    }
                                                }
                                            }.addOnFailureListener { error ->
                                                dialogText =
                                                    error.localizedMessage ?: "Unknown error"
                                                openConfirmDialog = true
                                                /*Toast.makeText(
                                                    context,
                                                    error.localizedMessage,
                                                    Toast.LENGTH_SHORT
                                                ).show()*/
                                            }
                                    } else {
                                        dialogText =
                                            "there is no account associated with this email and password"
                                        openConfirmDialog = true
                                    }
                                }.addOnFailureListener { error ->
                                    dialogText = error.localizedMessage ?: "Unknown error"
                                    openConfirmDialog = true
                                    /*Toast.makeText(context, it.localizedMessage, Toast.LENGTH_SHORT)
                                        .show()*/
                                }.await()
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
                    } else Text(text = stringResource(id = R.string.SignIn))
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

        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(text = buildAnnotatedString {
                append(text = stringResource(id = R.string.DontHaveAccount))
                append(text = " ")
                withStyle(style = SpanStyle(color = Color.Blue)) {
                    append(text = stringResource(id = R.string.SignUp))
                }
            },
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .clickable {
                        navController.navigate(Route.SignUpScreen.route + "/${locationInfo?.latitude}/${locationInfo?.longitude}")
                    })
        }
    }

}/*@Preview(showBackground = true, showSystemUi = true)
@Composable
fun test() {
    val navController = rememberNavController()
    SignInScreen(navController = navController)
}*/
