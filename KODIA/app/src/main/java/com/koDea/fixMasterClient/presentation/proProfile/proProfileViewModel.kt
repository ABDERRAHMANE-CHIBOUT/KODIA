package com.koDea.fixMasterClient.presentation.proProfile

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.ProfileHandyMenInfo
import com.koDea.fixMasterClient.domain.useCases.getHandyMenByID
import com.koDea.fixMasterClient.domain.useCases.getProfileHandyMenInfoUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class proProfileViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getHandyMenByID: getHandyMenByID,
) : ViewModel() {
    private var _handyMen : MutableState<Response<HandyMan>> = mutableStateOf(Response.onLoading)
    var handyMen : State<Response<HandyMan>> = _handyMen

    init {
        savedStateHandle.get<String>("ID")?.let {
            getHandyMen(it)
        }

    }

    fun getHandyMen(id: String) {
        viewModelScope.launch {
            getHandyMenByID(id).collect {
                _handyMen.value = it
            }
        }
    }


}