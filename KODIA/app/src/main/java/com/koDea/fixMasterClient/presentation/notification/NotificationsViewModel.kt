package com.koDea.fixMasterClient.presentation.notification

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.Notification
import com.koDea.fixMasterClient.domain.useCases.getHandyMenByID
import com.koDea.fixMasterClient.domain.useCases.getNotificationFirestoreUseCase
import com.koDea.fixMasterClient.domain.useCases.getRequestsByClientIDUseCase
import com.koDea.fixMasterClient.domain.useCases.getReqwithHandymanUseCase
import com.koDea.fixMasterClient.domain.useCases.sendNotificationFirestoreUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class NotificationsViewModel @Inject constructor(
    private val getNotificationFirestoreUseCase: getNotificationFirestoreUseCase,
    private val sendNotificationFirestoreUseCase: sendNotificationFirestoreUseCase
) : ViewModel() {

    private var _sendNotificationState = mutableStateOf<Response<Unit>>(Response.onLoading)
    var sendNotificationState : State<Response<Unit>> = _sendNotificationState

    private var _notificationList = mutableStateOf<Response<List<Notification>>>(Response.onLoading)
    var notificationList : State<Response<List<Notification>>> = _notificationList

    init {
        viewModelScope.launch {
            getNotificationFirestoreUseCase().collect{
                _notificationList.value = it
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

}