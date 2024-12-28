package com.koDea.fixMasterClient.presentation.settings.profile

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.UserInfo
import com.koDea.fixMasterClient.domain.useCases.getUserInfoUseCase
import com.koDea.fixMasterClient.domain.useCases.updateUserInfoUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileSettingsViewModel @Inject constructor(private val getUserInfoUseCase: getUserInfoUseCase , private val updateUserInfoUseCase: updateUserInfoUseCase) : ViewModel(){
    private val _userInfo : MutableState<Response<UserInfo?>> = mutableStateOf(
        Response.onLoading)
    val userInfo : State<Response<UserInfo?>> = _userInfo


    private val _updateUser : MutableState<Response<Boolean>> = mutableStateOf(
        Response.onLoading)
    val updateUser : State<Response<Boolean>> = _updateUser
    init {
        viewModelScope.launch {
            getUserInfoUseCase().collect{
                _userInfo.value = it
            }
        }

    }
    fun updateUserInfo(userInfo : UserInfo){
        viewModelScope.launch {
            updateUserInfoUseCase(userInfo).collect{
                _updateUser.value = it
            }
        }
    }

}