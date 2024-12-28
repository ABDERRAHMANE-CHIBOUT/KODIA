package com.koDea.fixMasterClient.presentation.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.useCases.removeSavedHandyMenUseCase
import com.koDea.fixMasterClient.domain.useCases.saveHandyMenUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CardProviderViewModel @Inject constructor(private val removeSavedHandyMenUseCase: removeSavedHandyMenUseCase, private val savedHandyMenUseCase: saveHandyMenUseCase) :
    ViewModel() {
    fun removeSavedHandyMen(handyMenID: String) {
        viewModelScope.launch {
            removeSavedHandyMenUseCase(handyMenID).collect {
            }

        }
    }
    fun saveHandyMen(handyMenID: String) {
        viewModelScope.launch {
            savedHandyMenUseCase(handyMenID).collect{

            }

        }
    }
}