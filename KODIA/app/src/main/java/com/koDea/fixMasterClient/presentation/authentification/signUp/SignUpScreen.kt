package com.koDea.fixMasterClient.presentation.authentification.signUp

import android.content.Context
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.presentation.common.OutlinedTextField
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.Route
import java.util.regex.Pattern


@Composable
fun SignUpScreen(
    navController: NavHostController,
    viewModel: SignUpViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {


    var text by rememberSaveable {
        mutableStateOf("SignUp Screen")
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        /* when (val response = viewModel.data.value) {
             is Response.onLoading -> {
                 //Toast.makeText(LocalContext.current , "loading" ,Toast.LENGTH_LONG).show()
                 CircularProgressIndicator()

             }

             is Response.onSuccess -> {*//*text = "country : ${response.data.addresses[0].address.country}\n" +
                        "wilya : ${response.data.addresses[0].address.countrySubdivision}\n" +
                        "City : ${response.data.addresses[0].address.municipality}\n" +
                        "ZipCode : ${response.data.addresses[0].address.postalCode}\n" +
                        "Daira : ${response.data.addresses[0].address.countrySecondarySubdivision}"
*//*
                text = "country : ${response.data.display_name}"

                Text(text = text, fontSize = 14.sp)
            }

            is Response.onFaillure -> {
                Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_SHORT).show()
            }
        }*/

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())

        ) {
            Text(
                text = stringResource(id = R.string.SignUp),
                fontSize = 40.sp,
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                modifier = Modifier.padding(top = 48.dp)
            )

            Text(
                text = "Create Your Account For Better Experience",
                color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                modifier = Modifier.padding(
                    bottom = 24.dp,
                    top = 12.dp,
                    start = 24.dp,
                    end = 24.dp
                ),
                textAlign = TextAlign.Center

            )
            var FirstName = rememberSaveable {
                mutableStateOf("")
            }
            var FirstNameError = rememberSaveable { mutableStateOf(false) }
            var FirstNameSupportingText = rememberSaveable { mutableStateOf("") }

            OutlinedTextField(
                value = FirstName,
                placeHolder = "First name",
                label = "First name",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.AccountCircle,
                        contentDescription = null
                    )
                },
                trailingIcon = { /*TODO*/ },
                supportingText = FirstNameSupportingText,
                isError = FirstNameError

            )
            var LastName = rememberSaveable {
                mutableStateOf("")
            }
            var LastNameError = rememberSaveable { mutableStateOf(false) }
            var LastNameSupportingText = rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = LastName,
                placeHolder = "Last name",
                label = "Last name",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.AccountCircle,
                        contentDescription = null
                    )
                },
                trailingIcon = { /*TODO*/ },
                supportingText = LastNameSupportingText,
                isError = LastNameError
            )
            var Email = rememberSaveable {
                mutableStateOf("")
            }
            var EmailError = rememberSaveable { mutableStateOf(false) }
            var EmailSupportingText = rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = Email,
                placeHolder = "Email",
                label = "Email",
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = null
                    )
                },
                trailingIcon = { /*TODO*/ },
                supportingText = EmailSupportingText,
                isError = EmailError
            )
            var PhoneNumber = rememberSaveable {
                mutableStateOf("")
            }
            var PhoneNumberError = rememberSaveable { mutableStateOf(false) }
            var PhoneNumberSupportingText = rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = PhoneNumber,
                placeHolder = "Phone number",
                label = "Phone number",
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.phone),
                        contentDescription = null
                    )
                },
                trailingIcon = { /*TODO*/ }, supportingText = PhoneNumberSupportingText,
                isError = PhoneNumberError,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone,
                    imeAction = ImeAction.Next
                )
            )

            var Password = rememberSaveable {
                mutableStateOf("")
            }
            var passwordVisibility by remember {
                mutableStateOf(false)
            }
            var PasswordError = rememberSaveable { mutableStateOf(false) }
            var PasswordSupportingText = rememberSaveable { mutableStateOf("") }
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
                    IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                        Icon(
                            imageVector = if (!passwordVisibility) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                            contentDescription = null
                        )
                    }
                }, supportingText = PasswordSupportingText,
                isError = PasswordError,
                visualTransformation = if (!passwordVisibility) PasswordVisualTransformation() else VisualTransformation.None
            )

            var ConfirmPassword = rememberSaveable {
                mutableStateOf("")
            }
            var confirmPasswordVisibility by remember {
                mutableStateOf(false)
            }
            var ConfirmPasswordError = rememberSaveable { mutableStateOf(false) }
            var ConfirmPasswordSupportingText = rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = ConfirmPassword,
                placeHolder = "Confirm password",
                label = "Confrim password",
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.password),
                        contentDescription = null
                    )
                },
                trailingIcon = {
                    IconButton(onClick = {
                        confirmPasswordVisibility = !confirmPasswordVisibility
                    }) {
                        Icon(
                            imageVector = if (!confirmPasswordVisibility) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                            contentDescription = null
                        )
                    }
                },
                supportingText = ConfirmPasswordSupportingText,
                isError = ConfirmPasswordError,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                visualTransformation = if (!confirmPasswordVisibility) PasswordVisualTransformation() else VisualTransformation.None,
                )
            var progressBarState = remember {
                mutableStateOf(false)
            }
            Button(
                onClick = {
                    if (FirstName.value.isEmpty()) {
                        FirstNameError.value = true
                        FirstNameSupportingText.value = "First Name can't be empty"
                    } else if (FirstName.value.length < 3) {
                        FirstNameError.value = true
                        FirstNameSupportingText.value = "First Name should be more 2 char"
                    }
                    if (LastName.value.isEmpty()) {
                        LastNameError.value = true
                        LastNameSupportingText.value = "Last Name can't be empty"
                    } else if (LastName.value.length < 3) {
                        LastNameError.value = true
                        LastNameSupportingText.value = "Last Name should be more 2 char"
                    }
                    if (Email.value.isEmpty()) {
                        EmailError.value = true
                        EmailSupportingText.value = "Email can't be empty"
                    } else {
                        if (!Patterns.EMAIL_ADDRESS.matcher(Email.value).matches()) {
                            EmailError.value = true
                            EmailSupportingText.value = "Please enter a valid email address"
                        }
                    }
                    if (PhoneNumber.value.isEmpty()) {
                        PhoneNumberError.value = true
                        PhoneNumberSupportingText.value = "phone number can't be empty"
                    } else {
                        if (!Patterns.PHONE.matcher(PhoneNumber.value).matches()) {
                            PhoneNumberError.value = true
                            PhoneNumberSupportingText.value = "Please enter a valid Phone number"
                        }
                    }
                    if (Password.value.isEmpty()) {
                        PasswordError.value = true
                        PasswordSupportingText.value = "Password can't be empty"
                    } else {
                        if (Password.value.length < 8) {
                            PasswordError.value = true
                            PasswordSupportingText.value = "Password should be more than 8 char"
                        }
                    }
                    if (ConfirmPassword.value.isEmpty()) {
                        ConfirmPasswordError.value = true
                        ConfirmPasswordSupportingText.value = "Password can't be empty"
                    } else {
                        if (ConfirmPassword.value.length < 8) {
                            ConfirmPasswordError.value = true
                            ConfirmPasswordSupportingText.value =
                                "Password should be more than 8 char"
                        } else {
                            if (ConfirmPassword.value != Password.value) {
                                ConfirmPasswordError.value = true
                                ConfirmPasswordSupportingText.value = "Password not matches"
                            }
                        }
                    }
                    if (!FirstNameError.value && !LastNameError.value && !EmailError.value && !PhoneNumberError.value && !PasswordError.value && !ConfirmPasswordError.value) {
                        viewModel.signUp(
                            FirstName.value,
                            LastName.value,
                            Email.value,
                            PhoneNumber.value,
                            Password.value
                        )

                    }

                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (progressBarState.value) {
                        CircularProgressIndicator(
                            color = Color.White,
                            modifier = Modifier
                                .size(26.dp)
                                .fillMaxSize(),
                            strokeWidth = 2.5.dp
                        )
                    } else Text(text = stringResource(id = R.string.SignUp))
                    when (val resp = viewModel.signUpState.value) {
                        is Response.onLoading -> {
                            progressBarState.value = true
                        }

                        is Response.onFaillure -> {
                            progressBarState.value = false
                            Toast.makeText(context, resp.message, Toast.LENGTH_SHORT).show()
                        }

                        is Response.onSuccess -> {
                            progressBarState.value = false
                            if (resp.data) {
                                navController.navigate(Route.BrowseNavigation.route) {
                                    popUpTo(Route.AuthNavigation.route) {
                                        inclusive = true
                                    }
                                }
                            }

                        }

                    }
                }

            }


        }

    }
}

