package com.koDea.fixMasterClient.presentation.postTask

import android.net.Uri
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

fun addJobToFirestore(job: Job, images : List<Uri>) {
    val db = FirebaseFirestore.getInstance()
    val storage = FirebaseStorage.getInstance().reference

    val collectionRef = db.collection("Jobs")
    val documentRef = collectionRef.add(job)
        .addOnSuccessListener { documentReference ->
            val documentId = documentReference.id
            val ref = storage
            for (i in 1..images.size) {
                ref.child("Job/$documentId/image$i.jpg").putFile(images[i - 1])
                    .addOnSuccessListener {

                        Log.d("upload", "success")
                    }.addOnFailureListener {
                    Log.d("upload", it.localizedMessage ?: "failled")
                }
            }
        }
        .addOnFailureListener { e ->
            println("Error adding document: $e")

        }

}
