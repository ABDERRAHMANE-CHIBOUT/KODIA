package com.koDea.fixMasterClient.presentation.authentification

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.useCases.authentifaction.AuthUseCases
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authUseCases: AuthUseCases
) : ViewModel() {
    val isUserAuth get() = authUseCases.isUserAuth()

    private val _signInState = mutableStateOf<Response<Boolean>>(Response.onSuccess(false))
    val signInState : State<Response<Boolean>> = _signInState

    private val _signUpState = mutableStateOf<Response<Boolean>>(Response.onSuccess(false))
    val signUpState : State<Response<Boolean>> = _signUpState

    private val _signOutState = mutableStateOf<Response<Boolean>>(Response.onSuccess(false))
    val signOutState : State<Response<Boolean>> = _signOutState

    fun signIn(email:String , password : String){
        viewModelScope.launch {
            authUseCases.signInWithEmailandPassword(email, password).collect{
                _signInState.value = it
            }

        }
    }
    /*fun signUp(email:String , password : String , userName : String){
        viewModelScope.launch {
            authUseCases.signUp(email, password, userName).collect{
                _signUpState.value = it
            }
        }
    }*/
    fun signOut(){
        viewModelScope.launch {
            authUseCases.signOut().collect{
                _signInState.value = it
                if (it== Response.onSuccess(true)){
                    _signInState.value = Response.onSuccess(false)
                }
            }

        }
    }
}