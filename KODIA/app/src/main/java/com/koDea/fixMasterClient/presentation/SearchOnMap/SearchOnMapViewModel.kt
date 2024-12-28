package com.koDea.fixMasterClient.presentation.SearchOnMap

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.getHandyManListUseCase
import com.koDea.fixMasterClient.domain.useCases.getLimitHandyManListUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchOnMapViewModel @Inject constructor(
    private val getHandyManListUseCase: getHandyManListUseCase,
) : ViewModel() {

    private var _HandyManList = mutableStateOf<Response<List<HandyMan?>>>(Response.onLoading)
    var HandyManList: State<Response<List<HandyMan?>>> = _HandyManList



    init {
        getHandyManList()
    }


    fun getHandyManList(){
        viewModelScope.launch {
            getHandyManListUseCase().collect {
                _HandyManList.value = it
            }
        }
    }
}