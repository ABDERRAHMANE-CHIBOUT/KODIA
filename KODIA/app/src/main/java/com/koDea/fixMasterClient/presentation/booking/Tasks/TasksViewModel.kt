package com.koDea.fixMasterClient.presentation.booking.Tasks

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
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.useCases.getTaskWithHandymanUseCase
import com.koDea.fixMasterClient.presentation.booking.Jobs.Job
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

@HiltViewModel
class TasksViewModel  @Inject constructor(
    //savedStateHandle: SavedStateHandle,
    private val getTaskWithHandymanUseCase :getTaskWithHandymanUseCase
) : ViewModel() {

    private var _tasks: MutableState<Response<List<Task?>>> = mutableStateOf(Response.onLoading)
    var tasks: State<Response<List<Task?>>> = _tasks

    private var _tasks2: MutableState<Response<List<BookingT?>>> = mutableStateOf(Response.onLoading)
    var tasks2: State<Response<List<BookingT?>>> = _tasks2

    val auth = FirebaseAuth.getInstance().currentUser!!.uid

    private var _imagesList: MutableState<Response<List<String?>>> = mutableStateOf(Response.onLoading)
    var images: State<Response<List<String?>>> = _imagesList
    init {
        viewModelScope.launch {
            getTaskswithHandyman(auth)
        }
    }

    fun getTaskswithHandyman(id :String){
        viewModelScope.launch {
            getTaskWithHandymanUseCase(id).collect(){
                _tasks2.value =it
            }
        }
    }

    fun getTasks(id :String){
        viewModelScope.launch {
            getTasksByClient(id).collect {
                _tasks.value = it
                Log.i("checkk",it.toString())
            }
        }
    }
    private fun getTasksByClient(id:String): Flow<Response<List<Task>>> = callbackFlow {
        Response.onLoading
        val db = Firebase.firestore
        val taskCollection = db.collection("tasks")
            .whereEqualTo("clientId", id)
            .addSnapshotListener { value, error ->
                val resp: Response<List<Task>> =
                    if (value != null) {
                        var taskslist = arrayListOf<Task>()
                        value.documents.forEach {
                            val taskId = it.id
                            val task = it.toObject(Task::class.java)!!
                            task.id =taskId
                            taskslist.add(task)
                        }
                        Response.onSuccess(taskslist)
                    } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                trySend(resp).isSuccess
            }
        awaitClose {
            taskCollection.remove()
        }
    }
    fun getImages(id :String){
        viewModelScope.launch {
            getImagesFlow(id).collect{
                _imagesList.value = it
            }
        }
    }
    private fun getImagesFlow(id: String): Flow<Response<List<String>>> = flow {
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

    fun addTask(task :Task){
        val db = FirebaseFirestore.getInstance()
        val storage = FirebaseStorage.getInstance().reference

        val collectionRef = db.collection("tasks")
        val documentRef = collectionRef.add(task)
            .addOnSuccessListener { documentReference ->
                val documentId = documentReference.id
                val ref = storage
                Log.i("taskcheck",documentId)
            }
            .addOnFailureListener { e ->
                println("Error adding document: $e")

            }
    }
    fun deleteTask(id :String) = CoroutineScope(Dispatchers.IO).launch {
        try {
            val task = Firebase.firestore.collection("tasks").document(id)
                .get()
                .await()
                try {
                    task.reference.delete().await()
                } catch (e: Exception) {
                    // Handle exception if needed
                }
        } catch (e: Exception) {
            // Handle exception if needed
        }
    }

}
