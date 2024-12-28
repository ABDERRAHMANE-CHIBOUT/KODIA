package com.koDea.fixMasterClient.presentation.Request

import android.net.Uri
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.Notification
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.domain.useCases.getHandyMenByID
import com.koDea.fixMasterClient.domain.useCases.locationUseCases.GetLocationUseCases
import com.koDea.fixMasterClient.domain.useCases.sendNotificationFirestoreUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RequestViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getHandyMenByID: getHandyMenByID,
    private val getLocationUseCases: GetLocationUseCases,
    private val sendNotificationFirestoreUseCase: sendNotificationFirestoreUseCase
) : ViewModel() {



    private var _handyMen : MutableState<Response<HandyMan>> = mutableStateOf(Response.onLoading)
    var handyMen : State<Response<HandyMan>> = _handyMen
    private var _location : MutableState<Response<GeocodeReverseResponse>> = mutableStateOf(Response.onLoading)
    var location : State<Response<GeocodeReverseResponse>> = _location

    private var _addRequestState : MutableState<Response<Boolean>> = mutableStateOf(Response.onLoading)
    var addRequestState : State<Response<Boolean>> = _addRequestState
    /*private var _requests : MutableState<Response<List<Request>>> = mutableStateOf(Response.onLoading)
    var request :State<Response<List<Request>>> = _requests*/

    private var _sendNotificationState = mutableStateOf<Response<Unit>>(Response.onLoading)
    var sendNotificationState : State<Response<Unit>> = _sendNotificationState
    init {
        savedStateHandle.get<String>("ID")?.let {
            getHandyMen(it)
        }
    }

    fun getHandyMen(id: String) {
        viewModelScope.launch {
            getHandyMenByID(id).collect{
                _handyMen.value = it
            }
        }
    }
    fun getLocation(lat : String , lon : String){
        viewModelScope.launch {
            getLocationUseCases(lat, lon).collect{
                _location.value = it
            }
        }
    }
    fun addRequest(request : Request , images : List<Uri> , token : String){
        viewModelScope.launch {
            addRequestToFirestore(request , images , token).collect{
                _addRequestState.value = it
            }
        }
    }

    fun sendNotificationFireStore(notification : Notification){
        viewModelScope.launch {
            sendNotificationFirestoreUseCase(notification).collect{
                _sendNotificationState.value = it
            }
        }
    }
    /*fun getRequests(id :String){
        viewModelScope.launch {
            getRequestsByClientID(id).collect() {
                _requests.value = it
            }
        }
    }*/
}