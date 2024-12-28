package com.koDea.fixMasterClient.presentation.proProfile.DetailsReviews

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.model.Review
import com.koDea.fixMasterClient.domain.useCases.getHandyMenReviewsUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsReviewsViewModel @Inject constructor(savedStateHandle : SavedStateHandle,
    private val getHandyMenReviews: getHandyMenReviewsUseCase) : ViewModel(){

        private val _reviews : MutableState<Response<List<Review>>> = mutableStateOf(Response.onLoading)
    val reviews : State<Response<List<Review>>> = _reviews

    init {
        savedStateHandle.get<String>("ID").let {
            getReviews(it!!)
        }
    }

    fun getReviews(id : String){
        viewModelScope.launch {
            getHandyMenReviews(id).collect {
                _reviews.value = it
            }
        }
    }
}