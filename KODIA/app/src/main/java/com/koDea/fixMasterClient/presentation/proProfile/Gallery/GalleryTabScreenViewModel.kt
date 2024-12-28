package com.koDea.fixMasterClient.presentation.proProfile.Gallery

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koDea.fixMasterClient.domain.useCases.getGalleryImagesUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class GalleryTabScreenViewModel @Inject constructor(private val getGalleryImagesUseCase: getGalleryImagesUseCase , savedStateHandle: SavedStateHandle) : ViewModel() {
    private var _imagesList: MutableState<Response<List<String?>>> = mutableStateOf(Response.onLoading)
    var images: State<Response<List<String?>>> = _imagesList

    init {
        savedStateHandle.get<String>("ID")?.let {
            getImages(it)
        }
    }
    private fun getImages(id : String){
        viewModelScope.launch {
            getGalleryImagesUseCase(id).collect{
                _imagesList.value = it
            }
        }
    }
}
