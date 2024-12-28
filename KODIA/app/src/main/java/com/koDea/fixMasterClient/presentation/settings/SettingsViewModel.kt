package com.koDea.fixMasterClient.presentation.settings

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
class SettingsViewModel @Inject constructor (private val authUseCases: AuthUseCases) : ViewModel() {

    private val _signOutState = mutableStateOf<Response<Boolean>>(Response.onSuccess(false))
    val signOutState : State<Response<Boolean>> = _signOutState

    fun signOut(){
        viewModelScope.launch {
            authUseCases.signOut().collect{
                _signOutState.value = it
            }

        }
    }
}