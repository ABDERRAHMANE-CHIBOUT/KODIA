package com.koDea.fixMasterClient.data.repository

import android.util.Log
import androidx.compose.runtime.rememberCoroutineScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.messaging.FirebaseMessaging
import com.koDea.fixMasterClient.domain.repository.AuthRepository
import com.koDea.fixMasterClient.util.Response
import com.onesignal.OneSignal
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import kotlin.Exception

class AuthRepositoryImpl @Inject constructor(
    val auth: FirebaseAuth,
    val firestore: FirebaseFirestore
) : AuthRepository {


    private var operationSuccessful = false

    /*override fun signInWithEmailandPassword(
        email: String,
        password: String
    ): Flow<Response<Boolean>> = flow {

        operationSuccessful = false
        try {
            emit(Response.onLoading)
            auth.signInWithEmailAndPassword(email, password).await()
            emit(Response.onSuccess(true))

        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "An enexpected error"))
        }
    }*/
    override fun signInWithEmailandPassword(
        email: String,
        password: String
    ): Flow<Response<Boolean>> = callbackFlow {
        Response.onLoading
        firestore.collection("Clients").whereEqualTo("Email", email).get().addOnSuccessListener {
            Log.d("fireStoreSuccess", true.toString())
            val docs = it.documents
            val resp: Response<Boolean> = Response.onSuccess(false)
            if (docs.isNotEmpty()) {
                Log.d("docsEmpty", true.toString())
                if (docs[0]["Actor"] == "Client") {
                    Log.d("heisClient", true.toString())
                    Response.onSuccess(true)
                    auth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
                        Response.onSuccess(true)
                    }.addOnFailureListener {
                        Response.onFaillure<Boolean>("signIn failled")
                    }
                } else {
                    Log.d("heisClient", false.toString())
                    Response.onFaillure<Boolean>("Actor not client")
                }
            } else {
                Log.d("docsEmpty", false.toString())
                Response.onFaillure<Boolean>("docs is empty")
            }
            trySend(resp).isSuccess

        }.addOnFailureListener {
            val resp: Response<Boolean> =
                Response.onFaillure(it.localizedMessage ?: "firestore error")
            trySend(resp)
        }
        awaitClose {
        }
    }
    /*override fun signInWithEmailandPassword(
        email: String,
        password: String
    ): Flow<Response<Boolean>> = flow {
        var errorMessage: String = "error"
        try {
            emit(Response.onLoading)
            var signInSuccess = false
            Log.d("signInSuccess", errorMessage.toString())
            firestore.collection("Clients").whereEqualTo("Email", email).limit(1).get()
                .addOnSuccessListener {
                    Log.d("getUser", true.toString())
                    if (it.documents.isNotEmpty()) {
                        val x = it.documents[0].data?.get("Actor").toString()
                        if (x.equals("Client")) {
                            Log.d("equals" , true.toString())
                            auth.signInWithEmailAndPassword(email, password)
                                .addOnSuccessListener { Log.d("SignIn", true.toString())
                                errorMessage = ""}
                        } else {
                            Log.d("equals" , false.toString())
                        }
                    } else{
                        Log.d("emptyDocs" , true.toString())
                    }
                }.await()
            if (errorMessage == "") emit(Response.onSuccess(true))
            else emit(Response.onFaillure(errorMessage.toString()))
        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "Unexcpected"))
            Log.d("catchError", e.localizedMessage ?: "unexcpected")
        }

        operationSuccessful = false
        try {
            emit(Response.onLoading)
            auth.signInWithEmailAndPassword(email, password).await()
            emit(Response.onSuccess(true))

        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "An enexpected error"))
        }
    }*/

    /*override fun signUp(
        FirstName: String, LastName: String, Email: String, PhoneNumber: String, Password: String
    ): Flow<Response<Boolean>> = flow {
        val user = hashMapOf<String, Any>(
            "FirstName" to FirstName,
            "LastName" to LastName,
            "Email" to Email,
            "PhoneNumber" to PhoneNumber,
            "Actor" to "Client"
        )
        try {
            emit(Response.onLoading)
            auth.createUserWithEmailAndPassword(Email, Password).addOnSuccessListener {
                // add user to fireStore
                firestore.collection("Clients").document(auth.currentUser?.uid!!).set(user)
                    .addOnSuccessListener {}
            }.await()
            emit(Response.onSuccess(true))
            Log.d("signUpSuccessful", operationSuccessful.toString())
            *//*if (signUpSuccessful){
                firestore.collection("Clients").document(auth.currentUser?.uid!!).set(user).addOnSuccessListener {
                }
                emit(Response.onSuccess(true))
            }else emit(Response.onSuccess(true))
                //emit(Response.onFaillure("SignUp failled!!"))
*//*
        } catch (e: Exception) {
            emit(Response.onFaillure(e.message ?: "An enexpected error"))
        }
    }*/
    override fun signUp(
        FirstName: String, LastName: String, Email: String, PhoneNumber: String, Password: String
    ): Flow<Response<Boolean>> = callbackFlow {
        var token : String? = null
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if (!it.isSuccessful) {
                return@addOnCompleteListener

            }
             token = it.result

        }.await()
        val user = hashMapOf<String, Any>(
            "FirstName" to FirstName,
            "LastName" to LastName,
            "Email" to Email,
            "PhoneNumber" to PhoneNumber,
            "DeviceToken" to OneSignal.User.pushSubscription.id
        )
        trySend(Response.onLoading)
        val snap = auth.createUserWithEmailAndPassword(Email, Password).addOnSuccessListener {
            // add user to fireStore
            firestore.collection("Clients").document(auth.currentUser?.uid!!).set(user)
                .addOnSuccessListener {
                    trySend(Response.onSuccess(true))
                }.addOnFailureListener {
                    trySend(Response.onFaillure(it.localizedMessage ?: "Unknown error"))
                }
        }.addOnFailureListener {
            trySend(Response.onFaillure(it.localizedMessage ?: "Unknown error"))
        }
        awaitClose {

        }

        /*if (signUpSuccessful){
            firestore.collection("Clients").document(auth.currentUser?.uid!!).set(user).addOnSuccessListener {
            }
            emit(Response.onSuccess(true))
        }else emit(Response.onSuccess(true))
            //emit(Response.onFaillure("SignUp failled!!"))
            }
*/
    }

    override fun signOut(): Flow<Response<Boolean>> = flow {
        try {
            emit(Response.onLoading)
            auth.signOut()
            emit(Response.onSuccess(true))

        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "An enexpected error"))
        }
    }

    override fun isUserAuth(): Boolean {
        return auth.currentUser != null
    }

    @ExperimentalCoroutinesApi
    override fun getUserAuthState(): Flow<Boolean> = callbackFlow {
        val authStateListener = FirebaseAuth.AuthStateListener {
            trySend(auth.currentUser == null)
        }
        auth.addAuthStateListener(authStateListener)
        awaitClose {
            auth.removeAuthStateListener(authStateListener)
        }
    }

    override fun getUserID(): String = auth.currentUser!!.uid.toString()
}