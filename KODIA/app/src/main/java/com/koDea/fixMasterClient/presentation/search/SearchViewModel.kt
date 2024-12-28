package com.koDea.fixMasterClient.presentation.search

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.searchUseCases.SearchUseCases
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(private val searchUseCases: SearchUseCases) :
    ViewModel() {

    private val _searchList: MutableState<Response<List<HandyMan?>>> =
        mutableStateOf(Response.onLoading)
    val searchList: State<Response<List<HandyMan?>>> = _searchList


    init {
        getHandyManList("" , selectedOption = "Name")
    }

    fun getHandyManList(text: String = "", selectedOption: String) {
        viewModelScope.launch {
            when (selectedOption) {
                "Name" -> {
                    searchUseCases.getHandyMenByName(text).collect {
                        _searchList.value = it
                    }
                }
                "Category" -> {
                    searchUseCases.getHandyMenByCategory(text).collect{
                        _searchList.value = it
                    }
                }
                "Location" ->{
                    searchUseCases.getHandyMenByLocation(text).collect{
                        _searchList.value = it
                    }
                }
            }
        }
    }
}