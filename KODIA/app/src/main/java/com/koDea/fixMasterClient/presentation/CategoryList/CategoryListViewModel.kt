package com.koDea.fixMasterClient.presentation.CategoryList

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.domain.useCases.getCategoriesUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryListViewModel @Inject constructor(private val getCategoryUseCase: getCategoriesUseCase) :
    ViewModel() {
    /*private var _category = mutableStateOf<Response<Category?>>(Response.onSuccess(null))
    var categoryList : State<Response<Category?>> = _category*/

    private var _category = mutableStateOf<Response<List<Category?>>>(Response.onLoading)
    var categoryList : State<Response<List<Category?>>> = _category


    init {
        viewModelScope.launch {
            getCategoryUseCase().collect{
                _category.value = it
            }
        }
    }

}