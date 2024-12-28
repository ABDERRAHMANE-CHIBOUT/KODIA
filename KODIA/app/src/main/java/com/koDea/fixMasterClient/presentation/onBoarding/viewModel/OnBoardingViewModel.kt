package com.koDea.fixMasterClient.presentation.onBoarding.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.useCases.appEntryUseCases.AppEntryUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class onBoardingViewModel @Inject constructor(private val appEntryUseCases: AppEntryUseCases) :
    ViewModel() {

    fun saveAppEntry() {
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry()
        }
    }
}



