package com.koDea.fixMasterClient.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.getBestRatingHandyMenUseCase
import com.koDea.fixMasterClient.domain.useCases.getBestSalaryHandyMenUseCase
import com.koDea.fixMasterClient.domain.useCases.getLimitHandyManListUseCase
import com.koDea.fixMasterClient.domain.useCases.getLimitCategoriesUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getLimitCategoriesUseCase: getLimitCategoriesUseCase,
    private val getLimitHandyManListUseCase: getLimitHandyManListUseCase,
    private val getBestRatingHandyMenUseCase: getBestRatingHandyMenUseCase,
    private val getBestSalaryHandyMenUseCase: getBestSalaryHandyMenUseCase
) :
    ViewModel() {
    private var _category = mutableStateOf<Response<List<Category?>>>(Response.onLoading)
    var categoryList: State<Response<List<Category?>>> = _category

    private var _HandyManList = mutableStateOf<Response<List<HandyMan?>>>(Response.onLoading)
    var HandyManList: State<Response<List<HandyMan?>>> = _HandyManList

    private var _BestSalaryHandyMan = mutableStateOf<Response<HandyMan?>>(Response.onLoading)
    var BestSalaryHandyMen: State<Response<HandyMan?>> = _BestSalaryHandyMan

    private var _BestRatingHandyMan = mutableStateOf<Response<HandyMan?>>(Response.onLoading)
    var BestRatingHandyMen: State<Response<HandyMan?>> = _BestRatingHandyMan


    init {
        getHandyManList()
        viewModelScope.launch {


            getLimitCategoriesUseCase().collect {
                _category.value = it
            }
        }
        viewModelScope.launch {

            getBestSalaryHandyMenUseCase().collect {
                _BestSalaryHandyMan.value = it
            }
        }
        viewModelScope.launch {
            getBestRatingHandyMenUseCase().collect {
                _BestRatingHandyMan.value = it
            }
        }


    }
    fun getHandyManList(){
        viewModelScope.launch {
            getLimitHandyManListUseCase().collect {
                _HandyManList.value = it
            }
        }
    }

}