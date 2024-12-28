package com.koDea.fixMasterClient.presentation.settings.profile

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.koDea.fixMasterClient.R
import com.koDea.fixMasterClient.domain.model.UserInfo
import com.koDea.fixMasterClient.util.Response
import com.koDea.fixMasterClient.util.navigation.Route

@Composable
fun ProfileSettingsScreen(
    viewModel: ProfileSettingsViewModel = hiltViewModel(),
    context: Context = LocalContext.current
) {

    var firstName by rememberSaveable {
        mutableStateOf("")
    }
    var firstNameSupportedText by rememberSaveable {
        mutableStateOf("")
    }
    var firstNameError by rememberSaveable {
        mutableStateOf(false)
    }
    var firstNameReadOnly by rememberSaveable {
        mutableStateOf(true)
    }
    var lastName by rememberSaveable {
        mutableStateOf("")
    }
    var lastNameSupportedText by rememberSaveable {
        mutableStateOf("")
    }
    var lastNameError by rememberSaveable {
        mutableStateOf(false)
    }
    var lastNameReadOnly by rememberSaveable {
        mutableStateOf(true)
    }

    var phoneNumber by rememberSaveable {
        mutableStateOf("")
    }
    var phoneNumberSupportedText by rememberSaveable {
        mutableStateOf("")
    }
    var phoneNumberReadOnly by rememberSaveable {
        mutableStateOf(true)
    }
    var phoneNumberError by rememberSaveable {
        mutableStateOf(false)
    }

    var changed by rememberSaveable {
        mutableStateOf(false)
    }

    var progressState by rememberSaveable {
        mutableStateOf(false)
    }

    when (val resp = viewModel.userInfo.value) {
        is Response.onLoading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        is Response.onFaillure -> {}
        is Response.onSuccess -> {
            val user = resp.data
            LaunchedEffect(Unit) {
                firstName = user?.FirstName ?: ""
                lastName = user?.LastName ?: ""
                phoneNumber = user?.PhoneNumber ?: ""

            }
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                        changed = true
                    },
                    label = { Text("First Name") },
                    placeholder = { Text(text = "Last Name") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.user_square),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { firstNameReadOnly = !firstNameReadOnly }) {
                            Icon(
                                painter = painterResource(id = R.drawable.edit),
                                contentDescription = null
                            )
                        }
                    },
                    readOnly = firstNameReadOnly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    supportingText = {
                        Text(
                            text = firstNameSupportedText,
                            color = MaterialTheme.colorScheme.error
                        )
                    },
                    isError = firstNameError
                )

                OutlinedTextField(
                    value = lastName,
                    onValueChange = {
                        lastName = it
                        changed = true
                    },
                    label = { Text("Last Name") },
                    placeholder = { Text(text = "Last Name") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.user_square),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { lastNameReadOnly = !lastNameReadOnly }) {
                            Icon(
                                painter = painterResource(id = R.drawable.edit),
                                contentDescription = null
                            )
                        }
                    },
                    readOnly = lastNameReadOnly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    supportingText = {
                        Text(
                            text = lastNameSupportedText,
                            color = MaterialTheme.colorScheme.error
                        )
                    },
                    isError = lastNameError
                )
                OutlinedTextField(
                    value = phoneNumber,
                    onValueChange = {
                        phoneNumber = it
                        changed = true
                    },
                    label = { Text("Phone Number") },
                    placeholder = { Text(text = "Phone Number") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.user_square),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { phoneNumberReadOnly = !phoneNumberReadOnly }) {
                            Icon(
                                painter = painterResource(id = R.drawable.edit),
                                contentDescription = null
                            )
                        }
                    },
                    readOnly = phoneNumberReadOnly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    supportingText = {
                        Text(
                            text = phoneNumberSupportedText,
                            color = MaterialTheme.colorScheme.error
                        )
                    },
                    isError = phoneNumberError
                )

                AnimatedVisibility(visible = changed) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = {
                            firstName = user!!.FirstName
                            lastName = user!!.LastName
                            phoneNumber = user!!.PhoneNumber
                            changed = false
                        }) {
                            Text(text = "Reset")
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        Button(onClick = {

                            if (firstName.isEmpty()) {
                                firstNameError = true
                                firstNameSupportedText = "First Name can't be empty"
                            } else if (firstName.length < 3) {
                                firstNameError = true
                                firstNameSupportedText = "First Name should be more 2 char"
                            }

                            if (lastName.isEmpty()) {
                                lastNameError = true
                                lastNameSupportedText = "Last Name can't be empty"
                            } else if (lastName.length < 3) {
                                lastNameError = true
                                lastNameSupportedText = "Last Name should be more 2 char"
                            }

                            if (phoneNumber.isEmpty()) {
                                phoneNumberError = true
                                phoneNumberSupportedText = "phone number can't be empty"
                            } else {
                                if (!Patterns.PHONE.matcher(phoneNumber).matches()) {
                                    phoneNumberError = true
                                    phoneNumberSupportedText = "Please enter a valid Phone number"
                                }
                            }

                            if (!firstNameError && !lastNameError && !phoneNumberError) {
                                viewModel.updateUserInfo(UserInfo(firstName , lastName , phoneNumber))


                            }


                        }) {

                            Row {
                                Text(text = "Save")
                                AnimatedVisibility(visible = progressState) {
                                    CircularProgressIndicator(
                                        color = Color.White,
                                        modifier = Modifier
                                            .size(26.dp)
                                            .fillMaxSize(),
                                        strokeWidth = 2.5.dp
                                    )
                                }

                            }
                        }
                    }
                }


            }

        }
    }

}