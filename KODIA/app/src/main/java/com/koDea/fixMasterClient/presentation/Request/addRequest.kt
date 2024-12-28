package com.koDea.fixMasterClient.presentation.Request

import android.net.Uri
import android.util.Log
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import java.util.Date


/*fun addRequestToFirestore(
    request: Request,
    images: List<Uri>,
    handyMenDeviceToken: String
): Flow<Response<Boolean>> = callbackFlow {
    trySend(Response.onLoading)
    try {
        val db = FirebaseFirestore.getInstance()
        val storage = FirebaseStorage.getInstance().reference
        val collectionRef = db.collection("requests")
        val s = collectionRef.add(request)
            .addOnSuccessListener { document ->
                for (i in images.indices) {
                    storage.child("Request/${document.id}/image${i + 1}.jpg")
                        .putFile(images[i])
                        .addOnSuccessListener {
                            // Success handling for each image upload
                        }
                        .addOnFailureListener { e ->
                            // Failure handling for each image upload
                            trySend(Response.onFaillure(e.localizedMessage ?: "unknown error"))
                        }
                }
                trySend(Response.onSuccess(true))
            }
            .addOnFailureListener { e ->
                // Failure handling for request addition
                trySend(Response.onFaillure(e.localizedMessage ?: "unknown error"))
            }.await()

        // Close the flow when it's no longer needed
        awaitClose { *//* Clean up resources here if needed *//*
        }

    } catch (e: Exception) {
        // Exception handling
        trySend(Response.onFaillure(e.localizedMessage ?: "unknown error"))
    }
}*/
fun addRequestToFirestore(
    request: Request,
    images: List<Uri>,
    handyMenDeviceToken: String
): Flow<Response<Boolean>> = flow {
    var operationSuccess = false
    emit(Response.onLoading)
    try {
        val db = FirebaseFirestore.getInstance()
        val storage = FirebaseStorage.getInstance().reference
        val collectionRef = db.collection("requests")
        val s = collectionRef.add(request).await()
            for (i in images.indices){
                storage.child("Request/${s.id}/image${i + 1}.jpg")
                    .putFile(images[i]).await()
            }

        emit(Response.onSuccess(true))

        val currentTime = Timestamp(Date(System.currentTimeMillis()))

        val not = hashMapOf(
            "ClientID" to request.ClientId,
            "Title" to "New request",
            "Time" to currentTime,
            "Text" to ""
        )
        db.collection("HandyMan").document(request.HandymanID).collection("Notification").add(not).await()
        //Adding request id to fetch images later
        val documentref = collectionRef.document("${s.id}")
        val id =mapOf("requestID" to s.id)
        documentref.update(id)
        // Close the flow when it's no longer needed
        /*awaitClose { *//* Clean up resources here if needed *//*
        }*/

    } catch (e: Exception) {
        // Exception handling
       // trySend(Response.onFaillure(e.localizedMessage ?: "unknown error"))
        emit(Response.onFaillure(e.localizedMessage?:"error"))
    }
}
