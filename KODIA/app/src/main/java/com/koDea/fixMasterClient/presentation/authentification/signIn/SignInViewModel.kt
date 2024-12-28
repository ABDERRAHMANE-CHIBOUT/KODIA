package com.koDea.fixMasterClient.presentation.authentification.signIn

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.location.LocationServices
import com.koDea.fixMasterClient.domain.useCases.authentifaction.AuthUseCases
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor (private val authUseCases: AuthUseCases) : ViewModel() {

    private var _signInState : MutableState<Response<Boolean?>> = mutableStateOf(Response.onLoading)
    var signInState  = _signInState
    fun signIn(Email : String , Password : String){
        viewModelScope.launch {
            authUseCases.signInWithEmailandPassword(email = Email , password = Password).collect{
                signInState.value = it
            }
        }
    }
}