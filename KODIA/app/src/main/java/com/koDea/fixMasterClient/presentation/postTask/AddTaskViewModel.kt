package com.koDea.fixMasterClient.presentation.postTask

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.domain.useCases.getCategoriesUseCase
import com.koDea.fixMasterClient.domain.useCases.locationUseCases.GetLocationUseCases
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddTaskViewModel @Inject constructor(private val getCategoryUseCase: getCategoriesUseCase,
                                           private val getLocationUseCases: GetLocationUseCases
) :
    ViewModel() {
    /*private var _category = mutableStateOf<Response<Category?>>(Response.onSuccess(null))
    var categoryList : State<Response<Category?>> = _category*/

    private var _category = mutableStateOf<Response<List<Category?>>>(Response.onLoading)
    var categoryList : State<Response<List<Category?>>> = _category

    private var _location : MutableState<Response<GeocodeReverseResponse>> = mutableStateOf(Response.onLoading)
    var location : State<Response<GeocodeReverseResponse>> = _location


    init {
        viewModelScope.launch {
            getCategoryUseCase().collect{
                _category.value = it
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

}