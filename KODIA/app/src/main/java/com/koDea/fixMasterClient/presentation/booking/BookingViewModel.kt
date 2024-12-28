package com.koDea.fixMasterClient.presentation.booking

import Task
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.getHandyMenByID
import com.koDea.fixMasterClient.domain.useCases.getRequestsByClientIDUseCase
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.domain.useCases.getHandyMenReviewsUseCase
import com.koDea.fixMasterClient.domain.useCases.getReqwithHandymanUseCase
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val getHandyMenByID: getHandyMenByID,
    private val getRequestsByClientIDUseCase: getRequestsByClientIDUseCase,
    private val getReqwithHadymanUseCase: getReqwithHandymanUseCase,
    //private val getImagesUseCase :getImagesUseCase
) : ViewModel() {
    private var _handyMen: MutableState<Response<HandyMan?>> = mutableStateOf(Response.onLoading)
    var handyMen: State<Response<HandyMan?>> = _handyMen
    private var _requestList: MutableState<Response<List<Request?>>> =
        mutableStateOf(Response.onLoading)
    var request: State<Response<List<Request?>>> = _requestList

    private var _imagesList: MutableState<Response<List<String?>>> = mutableStateOf(Response.onLoading)
    var images: State<Response<List<String?>>> = _imagesList
    val auth = FirebaseAuth.getInstance().currentUser!!.uid

    private var _requests: MutableState<Response<List<Booking?>>> =
        mutableStateOf(Response.onLoading)
    var requests: State<Response<List<Booking?>>> = _requests

    init {
        viewModelScope.launch {
            getRequestsWithHandyman(auth)
        }
    }
    init {
        viewModelScope.launch {
            //getTasks(auth)
        }
    }

    //needed in bookingcard
    fun getHandyMen(id: String) {
        viewModelScope.launch {
            getHandyMenByID(id).collect() {
                _handyMen.value = it
            }
        }
    }

    fun getRequests(id: String) {
        viewModelScope.launch {
            getRequestsByClientIDUseCase(id).collect() {
                _requestList.value = it
                Log.i("checker", auth)
            }
        }
    }
    fun getRequestsWithHandyman(id :String){
        viewModelScope.launch {
            getReqwithHadymanUseCase(id).collect(){
                _requests.value =it
            }
        }

    }
    /*fun getimages(id: String){
        viewModelScope.launch {
            getImagesUseCase(id).collect{
                _imagesList.value =it
            }
        }
    }*/
    /*fun getImages(id :String):ArrayList<Uri>{
        var imagesList = ArrayList<Uri>()
        val db = FirebaseFirestore.getInstance()
        val storage = FirebaseStorage.getInstance().reference
        val ref = storage.child("Request/${id}")
        ref.listAll().addOnSuccessListener { listResults ->
            for (item in listResults.items) {
                item.downloadUrl.addOnSuccessListener { uri ->
                    imagesList.add(uri)
                    Log.i("checker", uri.toString())
                }
                    .addOnFailureListener {
                        Log.i("checker", "error loading images")
                    }
            }
        }
        return imagesList
    }*/
    fun getImages(id :String){
        viewModelScope.launch {
            getImagesFlow(id).collect{
                _imagesList.value = it
            }
        }
    }
    fun getImagesFlow(id: String): Flow<Response<List<String>>> = flow {
        emit(Response.onLoading)
        try {
            val db = FirebaseFirestore.getInstance()
            val storage = FirebaseStorage.getInstance().reference
            val ref = storage.child("Request/$id").listAll().await()
                var imagesList = ArrayList<String>()
                for (item in ref.items) {
                    val uri = item.downloadUrl.await()
                    imagesList.add(uri.toString())
                }
                emit(Response.onSuccess(imagesList))

        }catch (e: Exception){
            emit(Response.onFaillure(e.localizedMessage?:"error"))
        }
    }

}