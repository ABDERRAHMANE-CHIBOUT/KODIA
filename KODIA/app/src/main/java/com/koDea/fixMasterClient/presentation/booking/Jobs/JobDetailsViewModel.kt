package com.example.handyapp.home.jobs

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.firestore.FirebaseFirestore
import com.koDea.fixMasterClient.presentation.booking.Jobs.Job
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JobDetailsViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    private var _job : MutableState<Response<Job?>> = mutableStateOf(Response.onLoading)
    var job : State<Response<Job?>> =_job
     var jobID : MutableState<String> = mutableStateOf("")
    init {
        savedStateHandle.get<String>("jobID")?.let {
            jobID.value = it
            Log.i("checker2",it)
        }
    }

    fun getJob(job:String){
        viewModelScope.launch {
            getJobDetaild(job).collect(){
                _job.value =it
            }
        }
    }
    fun getJobDetaild(jobid :String): Flow<Response<Job>> =callbackFlow {
        Response.onLoading
        val db = FirebaseFirestore.getInstance()
        val snapshot = db.collection("Jobs").document(jobid)
            .addSnapshotListener { value, error ->
                val resp = if (error == null) {
                    if (value != null) {
                        val info = value.toObject((Job::class.java))
                        val job =Job(
                            info!!.id,
                            info.category,
                            info.city,
                            info.day,
                            info.description,
                            info.hour,
                            info.max,
                            info.min,
                            info.status,
                            info.street,
                            info.title,
                            info.userId,
                            info.wilya

                        )

                        Response.onSuccess(job)
                    } else {
                        Response.onFaillure("there is no job with this id")
                    }
                } else {
                    Response.onFaillure(error.localizedMessage ?: "Unknown error")
                }
                trySend(resp).isSuccess

            }

        awaitClose {
            snapshot.remove()
        }
    }
}