package com.koDea.fixMasterClient.presentation.Review

import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore

fun addReview(review:Review){
    val db = FirebaseFirestore.getInstance()
    val collectionRef = db.collection("Reviews")
    val documentRef = collectionRef.add(review)
        .addOnSuccessListener { documentReference ->
            val documentId = documentReference.id

        }
        .addOnFailureListener { e ->
            println("Error adding document: $e")
            Log.i("review","Error adding document: $e")
        }
}