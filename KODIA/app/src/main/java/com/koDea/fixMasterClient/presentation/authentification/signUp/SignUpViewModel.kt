package com.koDea.fixMasterClient.presentation.authentification.signUp

import androidx.annotation.Keep
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.useCases.authentifaction.AuthUseCases
import com.koDea.fixMasterClient.domain.useCases.locationUseCases.GetLocationUseCases
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
@Keep
class SignUpViewModel @Inject constructor(
    private val getLocationUseCases: GetLocationUseCases,
    savedStateHandle: SavedStateHandle,
    private val authUseCases: AuthUseCases
) : ViewModel() {


    var signUpState : MutableState<Response<Boolean>> = mutableStateOf(Response.onSuccess(false))
        private set
    fun signUp(FirstName : String , LastName : String , Email : String , PhoneNumber : String , Password : String){
        viewModelScope.launch {

            authUseCases.signUp(FirstName, LastName, Email, PhoneNumber, Password).collect{
                signUpState.value = it
            }
        }
    }




    /*private var _data = mutableStateOf<Response<GeocodeReverseResponse>>(
        Response.onSuccess(
            GeocodeReverseResponse(address = Address("", "", "", "", "", "", "", "", ""),
                emptyList(),"","","","",0,"",0
            )
        )
    )
    var data = _data

    init {
        savedStateHandle.get<String>("lat")?.let {latitude ->
            savedStateHandle.get<String>("lon")?.let {longtitude ->
                getLocation(lat = latitude , lon = longtitude)
            }
        }
    }
    private fun getLocation(lat: String, lon: String) {
        viewModelScope.launch {
            getLocationUseCases(lat, lon).collect {
                _data.value = it
            }
        }
    }*/

}