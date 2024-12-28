package com.koDea.fixMasterClient.presentation.proProfile.Profile

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.ProfileHandyMenInfo
import com.koDea.fixMasterClient.domain.useCases.calcRating
import com.koDea.fixMasterClient.domain.useCases.getHandyMenByID
import com.koDea.fixMasterClient.domain.useCases.getProfileHandyMenInfoUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfleTabScreenViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getProfileHandyMenInfo: getProfileHandyMenInfoUseCase,
    private val calcRating: calcRating
) : ViewModel() {

    private var _profileInfo : MutableState<Response<ProfileHandyMenInfo>> = mutableStateOf(Response.onLoading)
    var profileInfo : State<Response<ProfileHandyMenInfo>> = _profileInfo

    private var _rating : MutableState<Response<HashMap<String , Any>>> = mutableStateOf(Response.onLoading)
    var rating : State<Response<HashMap<String , Any>>> = _rating
    init {
        savedStateHandle.get<String>("ID")?.let {
            getProfileInfo(it)
            viewModelScope.launch {
                calcRating(it).collect{
                    _rating.value = it
                }
            }
        }

    }

    fun getProfileInfo(id : String){
        viewModelScope.launch {
            getProfileHandyMenInfo(id).collect{
                _profileInfo.value = it
            }
        }
    }

}