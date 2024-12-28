package com.koDea.fixMasterClient.presentation.settings.savedHandyMan

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.getSavedHandyManListUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SavedHandyManViewModel @Inject constructor(private val savedHandyManListUseCase: getSavedHandyManListUseCase) : ViewModel(){
    private val _savedHandyManList : MutableState<Response<List<HandyMan>>> = mutableStateOf(Response.onLoading)
    val savedHandyManList : State<Response<List<HandyMan>>> = _savedHandyManList
    init {
        viewModelScope.launch {
            savedHandyManListUseCase().collect{
                _savedHandyManList.value = it
            }
        }
    }
}