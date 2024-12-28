package com.example.handyapp.home.jobs

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.firestore
import com.koDea.fixMasterClient.presentation.booking.Jobs.Job
import com.koDea.fixMasterClient.util.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JobsViewModel @Inject constructor() : ViewModel() {

    /*private val _jobs = MutableStateFlow<List<Job>>(emptyList())
    val jobs: StateFlow<List<Job>> = _jobs*/
    private val _ClientJobs: MutableState<Response<List<Job>>> = mutableStateOf(Response.onLoading)
    val ClientJobs: State<Response<List<Job>>> = _ClientJobs
    val auth = FirebaseAuth.getInstance().currentUser!!.uid
    init {
        getClientJobs(auth)
        Log.i("checker1","doing")
    }

    private fun getClientJobs(id:String) {
        viewModelScope.launch {
            getJobsDataByClient(id).collect {
                _ClientJobs.value = it
            }
        }
    }
    private fun getJobsDataByClient(id:String): Flow<Response<List<Job>>> = callbackFlow {
        Response.onLoading
        //val jobsList = mutableListOf<Job>()
        val db = Firebase.firestore
        val jobsCollection = db.collection("Jobs")
            .whereEqualTo("userId", id)
            .addSnapshotListener { value, error ->
                val resp: Response<List<Job>> =
                    if (value != null) {
                        var jobs = arrayListOf<Job>()
                        value.documents.forEach {
                            val jobId = it.id
                            val job = it.toObject(Job::class.java)!!
                            job.id = jobId
                            Log.i("checker1",job.userId)
                            jobs.add(job)
                        }
                        Response.onSuccess(jobs)
                    } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")

                trySend(resp).isSuccess
            }
        awaitClose {
            jobsCollection.remove()
        }
    }
}