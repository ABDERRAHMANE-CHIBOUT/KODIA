package com.koDea.fixMasterClient.data.repository

import Task
import android.net.Uri
import android.util.Log
import com.google.android.gms.common.api.Api.Client
import androidx.compose.runtime.mutableStateOf
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.Filter
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.getField
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.firestore.toObject
import com.google.firebase.storage.FirebaseStorage
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.HandyManplusID
import com.koDea.fixMasterClient.domain.model.Notification
import com.koDea.fixMasterClient.domain.model.ProfileHandyMenInfo
import com.koDea.fixMasterClient.domain.model.Review
import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.domain.model.UserInfo
import com.koDea.fixMasterClient.presentation.Chat.Message
import com.koDea.fixMasterClient.presentation.booking.Booking
import com.koDea.fixMasterClient.presentation.booking.Tasks.BookingT
import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class FireStoreRepositoryImpl @Inject constructor(
    private val fireStore: FirebaseFirestore, private val storage: FirebaseStorage,
    private val auth: FirebaseAuth
) : FireStoreRepository {
    override fun getCategories(): Flow<Response<List<Category>>> = callbackFlow {
        Response.onLoading
        val snapshotListener =
            fireStore.collection("services").addSnapshotListener { value, error ->
                val resp = if (value != null) {
                    val categoryList = value.toObjects(Category::class.java)
                    Response.onSuccess<List<Category>>(categoryList)
                } else Response.onFaillure(error?.message ?: "unknown error")
                trySend(resp).isSuccess
            }
        awaitClose {
            snapshotListener.remove()
        }
    }

    override fun getLimitCategories(): Flow<Response<List<Category>>> = callbackFlow {
        Response.onLoading
        val snapshotListener =
            fireStore.collection("services").limit(4).addSnapshotListener { value, error ->

                val resp = if (value != null) {
                    val categoryList = value.toObjects(Category::class.java)
                    Response.onSuccess<List<Category>>(categoryList)
                } else Response.onFaillure(error?.message ?: "unknown error")
                trySend(resp).isSuccess
            }
        awaitClose {
            snapshotListener.remove()
        }
    }/*override fun getCategories(): Flow<Response<Category>> = callbackFlow {
        Response.onLoading

        val snapshotListener = fireStore.collection("services").document("painting")
            .addSnapshotListener { value, error ->
                val resp = if (value != null) {
                    val item = value.toObject(Category::class.java)
                    Response.onSuccess<Category>(item!!)

                } else Response.onFaillure(error?.message ?: error.toString())

                trySend(resp).isSuccess
            }
        awaitClose {
            snapshotListener.remove()
        }

    }*/

    /*override fun getLimitHandyManList(): Flow<Response<List<HandyMan>>> = callbackFlow {
        Response.onLoading
        val snapshot = fireStore.collection("HandyMan").addSnapshotListener { value, error ->
            val resp = if (value != null) {
                val handyManList = value.toObjects(HandyMan::class.java)
                Response.onSuccess<List<HandyMan>>(handyManList)
            } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
            trySend(resp).isSuccess
        }
        awaitClose {
            snapshot.remove()
        }
    }*/
    override fun getHandyManList(): Flow<Response<List<HandyMan>>> = callbackFlow {
        Response.onLoading
        var savedList: List<String>? = null
        val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
        if (x.exists()) {
            val v = x.get("SavedHandyMen") as? List<String>
            savedList = v
        }
        val snapshot =
            fireStore.collection("HandyMan").addSnapshotListener { value, error ->
                val resp = if (value != null) {
                    var handyManList = arrayListOf<HandyMan>()
                    value.documents.forEach {
                        //val handyMen = it.toObject<HandyMan>(HandyMan::class.java)
                        val handyMen = HandyMan(
                            it.getString("Email") ?: "",
                            it.getString("FirstName") ?: "",
                            it.getString("LastName") ?: "",
                            it.getString("Category") ?: "",
                            it.getString("City") ?: "",
                            it.getString("Wilaya") ?: "",
                            it.getDouble("Rating") ?: 0.0,
                            it.getDouble("AverageSalary") ?: 0.0,
                            it.getString("ProfileImage") ?: "",
                            it.id,
                            it.getString("DeviceToken") ?: "",
                            it.getString("Status") ?: "",
                            it.getString("Latitude") ?: "",
                            it.getString("Longitude") ?: "",
                        )

                        handyManList.add(
                            HandyMan(
                                Email = handyMen!!.Email,
                                FirstName = handyMen.FirstName,
                                LastName = handyMen.LastName,
                                Category = handyMen.Category,
                                handyMen.City,
                                handyMen.Wilaya,
                                Rating = handyMen.Rating,
                                handyMen.AverageSalary,
                                handyMen.ProfileImage,
                                it.id,
                                DeviceToken = handyMen.DeviceToken,
                                Status = handyMen.Status,
                                Latitude = handyMen.Latitude,
                                Longitude = handyMen.Longitude,
                                saved = savedList?.contains(it.id) ?: false
                            )
                        )
                    }
                    Response.onSuccess<List<HandyMan>>(handyManList)
                } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                trySend(resp).isSuccess
            }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun getLimitHandyManList(): Flow<Response<List<HandyMan>>> = callbackFlow {
        Response.onLoading
        var savedList: List<String>? = null
        val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
        if (x.exists()) {
            val v = x.get("SavedHandyMen") as? List<String>
            savedList = v
        }

        val snapshot =
            fireStore.collection("HandyMan").limit(3).whereEqualTo("Status" , "ACTIVE").addSnapshotListener { value, error ->


                val resp = if (value != null) {
                    var handyManList = arrayListOf<HandyMan>()
                    value.documents.forEach {
                        /*var ratingSum = mutableStateOf<Float>(0.toFloat())
                        var nbRating = mutableStateOf(0)
                        val reviews =
                            fireStore.collection("Reviews").whereEqualTo("handyId", it.id).get()
                                .await()
                        reviews?.forEach { reviewDocument ->

                            val rating = reviewDocument.getDouble("value") ?: 0.0
                            //if (rating.isNotEmpty()) {
                            ratingSum.value = ratingSum.value + rating.toFloat()
                            //}

                            nbRating.value++


                        }
                        val rat: Float = ratingSum.value / reviews?.documents?.size!!*/
                        //val handyMen = it.toObject<HandyMan>(HandyMan::class.java)
                        val handyMen = HandyMan(
                            it.getString("Email") ?: "",
                            it.getString("FirstName") ?: "",
                            it.getString("LastName") ?: "",
                            it.getString("Category") ?: "",
                            it.getString("City") ?: "",
                            it.getString("Wilaya") ?: "",
                            it.getDouble("Rating") ?: 0.0,
                            it.getDouble("AverageSalary") ?: 0.0,
                            it.getString("ProfileImage") ?: "",
                            it.id,
                            it.getString("DeviceToken") ?: "",
                            it.getString("Status") ?: "",
                            it.getString("Latitude") ?: "",
                            it.getString("Longitude") ?: "",
                        )

                        handyManList.add(
                            HandyMan(
                                Email = handyMen!!.Email,
                                FirstName = handyMen.FirstName,
                                LastName = handyMen.LastName,
                                Category = handyMen.Category,
                                handyMen.City,
                                handyMen.Wilaya,
                                Rating = handyMen.Rating,
                                handyMen.AverageSalary,
                                handyMen.ProfileImage,
                                it.id,
                                DeviceToken = handyMen.DeviceToken,
                                Status = handyMen.Status,
                                Latitude = handyMen.Latitude,
                                Longitude = handyMen.Longitude,
                                saved = savedList?.contains(it.id) ?: false
                            )
                        )
                    }
                    Response.onSuccess<List<HandyMan>>(handyManList)
                } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                trySend(resp).isSuccess

            }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun getBestRatingHandyMen(): Flow<Response<HandyMan>> = callbackFlow {
        Response.onLoading
        var savedList: List<String>? = null
        val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
        if (x.exists()) {
            val v = x.get("SavedHandyMen") as? List<String>
            savedList = v
        }
        val snapshot =
            fireStore.collection("HandyMan").orderBy("Rating", Query.Direction.DESCENDING).limit(1)
                .addSnapshotListener { value, error ->
                    val resp = if (value != null) {
                        val handyMenDTO = value.documents[0].toObject(HandyMan::class.java)
                        val handyMen = HandyMan(
                            handyMenDTO!!.Email,
                            handyMenDTO.FirstName,
                            handyMenDTO.LastName,
                            handyMenDTO.Category,
                            handyMenDTO.City,
                            handyMenDTO.Wilaya,
                            Rating = handyMenDTO.Rating,
                            handyMenDTO.AverageSalary,
                            handyMenDTO.ProfileImage,
                            value.documents[0].id,
                            DeviceToken = handyMenDTO.DeviceToken,
                            Status = handyMenDTO.Status,
                            saved = savedList?.contains(value.documents[0].id) ?: false
                        )

                        Response.onSuccess(handyMen)
                    } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                    trySend(resp).isSuccess
                }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun getBestSalaryHandyMen(): Flow<Response<HandyMan>> = callbackFlow {
        Response.onLoading
        var savedList: List<String>? = null
        val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
        if (x.exists()) {
            val v = x.get("SavedHandyMen") as? List<String>
            savedList = v
        }
        val snapshot =
            fireStore.collection("HandyMan").orderBy("AverageSalary", Query.Direction.ASCENDING)
                .limit(1).addSnapshotListener { value, error ->
                    val resp = if (value != null) {
                        val handyMenDTO = value.documents[0].toObject(HandyMan::class.java)
                        val handyMen = HandyMan(
                            handyMenDTO!!.Email,
                            handyMenDTO.FirstName,
                            handyMenDTO.LastName,
                            handyMenDTO.Category,
                            handyMenDTO.City,
                            handyMenDTO.Wilaya,
                            handyMenDTO.Rating,
                            handyMenDTO.AverageSalary,
                            handyMenDTO.ProfileImage,
                            value.documents[0].id,
                            DeviceToken = handyMenDTO.DeviceToken,
                            Status = handyMenDTO.Status,
                            saved = savedList?.contains(value.documents[0].id) ?: false
                        )
                        Response.onSuccess(handyMen)
                    } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                    trySend(resp).isSuccess
                }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun getHandyMenByID(id: String): Flow<Response<HandyMan>> = callbackFlow {
        Response.onLoading
        var savedList: List<String>? = null
        val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
        if (x.exists()) {
            val v = x.get("SavedHandyMen") as? List<String>
            savedList = v
        }
        val snapshot = fireStore.collection("HandyMan").document(id)
            .addSnapshotListener { value, error ->
                val resp = if (value != null) {
                    val handyMenDTO = value.toObject(HandyMan::class.java)
                    val handyMen = HandyMan(
                        handyMenDTO!!.Email,
                        handyMenDTO.FirstName,
                        handyMenDTO.LastName,
                        handyMenDTO.Category,
                        handyMenDTO.City,
                        handyMenDTO.Wilaya,
                        handyMenDTO.Rating,
                        handyMenDTO.AverageSalary,
                        handyMenDTO.ProfileImage,
                        value.id,
                        handyMenDTO.DeviceToken,
                        handyMenDTO.Status,
                        saved = savedList?.contains(value.id) ?: false
                    )
                    Response.onSuccess(handyMen)
                } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                trySend(resp).isSuccess
            }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun getHandyManByName(text: String): Flow<Response<List<HandyMan>>> = callbackFlow {
        Response.onLoading
        var savedList: List<String>? = null
        val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
        if (x.exists()) {
            val v = x.get("SavedHandyMen") as? List<String>
            savedList = v
        }
        val snapshot = fireStore.collection("HandyMan")
            .where(
                Filter.and(
                    Filter.greaterThanOrEqualTo("FirstName", text),
                    Filter.lessThanOrEqualTo("FirstName", text + "\uf8ff")
                )
            )
            .addSnapshotListener { value, error ->
                var handyManList = arrayListOf<HandyMan>()
                val resp =
                    if (error == null) {
                        if (value != null) {
                            value.documents.forEach {
                                //val handyMenDTO = it.toObject(HandyMan::class.java)
                                val handyMenDTO = HandyMan(
                                    it.getString("Email") ?: "",
                                    it.getString("FirstName") ?: "",
                                    it.getString("LastName") ?: "",
                                    it.getString("Category") ?: "",
                                    it.getString("City") ?: "",
                                    it.getString("Wilaya") ?: "",
                                    it.getDouble("Rating") ?: 0.0,
                                    it.getDouble("AverageSalary") ?: 0.0,
                                    it.getString("ProfileImage") ?: "",
                                    it.id,
                                    it.getString("DeviceToken") ?: "",
                                    it.getString("Status") ?: "",
                                    it.getString("Latitude") ?: "",
                                    it.getString("Longitude") ?: "",
                                )
                                handyManList.add(
                                    HandyMan(
                                        handyMenDTO!!.Email,
                                        handyMenDTO.FirstName,
                                        handyMenDTO.LastName,
                                        handyMenDTO.Category,
                                        handyMenDTO.City,
                                        handyMenDTO.Wilaya,
                                        Rating = handyMenDTO.Rating,
                                        handyMenDTO.AverageSalary,
                                        handyMenDTO.ProfileImage,
                                        it.id,
                                        DeviceToken = handyMenDTO.DeviceToken,
                                        Status = handyMenDTO.Status,
                                        Latitude = handyMenDTO.Latitude,
                                        Longitude = handyMenDTO.Longitude,
                                        saved = savedList?.contains(it.id) ?: false
                                    )
                                )
                            }

                            Response.onSuccess<List<HandyMan>>(handyManList)
                        } else {
                            Response.onFaillure("there isn't any handyMen with this text")
                        }
                    } else Response.onFaillure(error.localizedMessage ?: "Unknown error")

                trySend(resp).isSuccess

            }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun getHandyManByCategory(text: String): Flow<Response<List<HandyMan>>> =
        callbackFlow {
            Response.onLoading
            var savedList: List<String>? = null
            val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
            if (x.exists()) {
                val v = x.get("SavedHandyMen") as? List<String>
                savedList = v
            }
            val snapshot = fireStore.collection("HandyMan")
                .whereGreaterThanOrEqualTo("Category", text)
                .whereLessThanOrEqualTo("Category", text + "\uf8ff")
                .addSnapshotListener { value, error ->
                    var handyManList = arrayListOf<HandyMan>()
                    val resp =
                        if (error == null) {
                            if (value != null) {
                                value.documents.forEach {
                                    val handyMenDTO = it.toObject(HandyMan::class.java)
                                    handyManList.add(
                                        HandyMan(
                                            handyMenDTO!!.Email,
                                            handyMenDTO.FirstName,
                                            handyMenDTO.LastName,
                                            handyMenDTO.Category,
                                            handyMenDTO.City,
                                            handyMenDTO.Wilaya,
                                            handyMenDTO.Rating,
                                            handyMenDTO.AverageSalary,
                                            handyMenDTO.ProfileImage,
                                            it.id,
                                            DeviceToken = handyMenDTO.DeviceToken,
                                            Status = handyMenDTO.Status,
                                            Latitude = handyMenDTO.Latitude,
                                            Longitude = handyMenDTO.Longitude,
                                            saved = savedList?.contains(it.id) ?: false
                                        )
                                    )
                                }

                                Response.onSuccess<List<HandyMan>>(handyManList)
                            } else {
                                Response.onFaillure("there isn't any handyMen with this text")
                            }
                        } else Response.onFaillure(error.localizedMessage ?: "Unknown error")

                    trySend(resp).isSuccess

                }
            awaitClose {
                snapshot.remove()
            }
        }

    override fun getHandyManByLocation(text: String): Flow<Response<List<HandyMan>>> =
        callbackFlow {
            Response.onLoading
            var savedList: List<String>? = null
            val x = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
            if (x.exists()) {
                val v = x.get("SavedHandyMen") as? List<String>
                savedList = v
            }
            val snapshot = fireStore.collection("HandyMan")
                .whereGreaterThanOrEqualTo("City", text)
                .whereLessThanOrEqualTo("City", text + "\uf8ff")
                .addSnapshotListener { value, error ->
                    var handyManList = arrayListOf<HandyMan>()
                    val resp =
                        if (error == null) {
                            if (value != null) {
                                value.documents.forEach {
                                    val handyMenDTO = it.toObject(HandyMan::class.java)
                                    handyManList.add(
                                        HandyMan(
                                            handyMenDTO!!.Email,
                                            handyMenDTO.FirstName,
                                            handyMenDTO.LastName,
                                            handyMenDTO.Category,
                                            handyMenDTO.City,
                                            handyMenDTO.Wilaya,
                                            handyMenDTO.Rating,
                                            handyMenDTO.AverageSalary,
                                            handyMenDTO.ProfileImage,
                                            it.id,
                                            DeviceToken = handyMenDTO.DeviceToken,
                                            Status = handyMenDTO.Status,
                                            Latitude = handyMenDTO.Latitude,
                                            Longitude = handyMenDTO.Longitude,
                                            saved = savedList?.contains(it.id) ?: false
                                        )
                                    )
                                }

                                Response.onSuccess<List<HandyMan>>(handyManList)
                            } else {
                                Response.onFaillure("there isn't any handyMen with this text")
                            }
                        } else Response.onFaillure(error.localizedMessage ?: "Unknown error")

                    trySend(resp).isSuccess

                }
            awaitClose {
                snapshot.remove()
            }
        }

    override fun getProfileHandyManInfo(id: String): Flow<Response<ProfileHandyMenInfo>> =
        callbackFlow {
            Response.onLoading
            val snapshot =
                fireStore.collection("HandyMan").document(id).addSnapshotListener { value, error ->
                    val resp =
                        if (error == null) {
                            if (value != null) {
                                //val info = value.toObject(ProfileHandyMenInfo::class.java)
                                /*val info = Proiel(
                                    value.getString("Email")?:"",
                                    value.getString("FirstName")?:"",
                                    value.getString("LastName")?:"",
                                    value.getString("Category")?:"",
                                    value.getString("City")?:"",
                                    value.getString("Wilaya")?:"",
                                    value.getDouble("Rating")?:0.0,
                                    value.getDouble("AverageSalary")?:0.0,
                                    value.getString("ProfileImage")?:"",
                                    value.id,
                                    value.getString("DeviceToken")?:"",
                                    value.getString("Status")?:"",
                                    value.getString("Latitude")?:"",
                                    value.getString("Longtitude")?:"",
                                )*/
                                val info = ProfileHandyMenInfo(
                                    nbReviews = value.getDouble("nbReviews") ?: 0.0,
                                    Rating = value.getDouble("Rating") ?: 0.0,
                                    OrdersCompleted = value.getString("OrdersCompleted") ?: "",
                                    About = value.getString("About") ?: "",
                                    SubCategory = value.getString("SubCategory") ?: "",
                                    WorkingAreas = value.getString("WorkingAreas") ?: "",
                                )

                                Response.onSuccess(info)
                            } else {
                                Response.onFaillure("there is no handyMen with this id")
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

    override fun getHandyMenReviews(id: String): Flow<Response<List<Review>>> = callbackFlow {
        trySend(Response.onLoading)

        val snapshot = fireStore.collection("Reviews").whereEqualTo("handyId", id)
            .addSnapshotListener { valueHandyMen, errorHandyMen ->

                if (errorHandyMen == null) {
                    val reviewList = mutableListOf<Review>()

                    valueHandyMen?.forEach { reviewDocument ->
                        val desc = reviewDocument.getString("description") ?: ""
                        val timestamp = reviewDocument.getString("Timestamp") ?: ""
                        val rating = reviewDocument.getDouble("value") ?: 0.0
                        val clientId = reviewDocument.getString("clientId") ?: ""

                        fireStore.collection("Clients").document(clientId)
                            .get()
                            .addOnSuccessListener { clientDocument ->
                                val firstName = clientDocument.getString("FirstName")
                                val lastName = clientDocument.getString("LastName")
                                val review = Review(
                                    FirstName = firstName ?: "Unknown",
                                    LastName = lastName ?: "Unknown",
                                    Description = desc,
                                    Timestamp = timestamp ?: "",
                                    Rating = rating.toFloat()
                                )
                                reviewList.add(review)
                                if (reviewList.size == valueHandyMen.size()) {
                                    trySend(Response.onSuccess(reviewList))
                                }
                            }
                            .addOnFailureListener { error ->
                                trySend(
                                    Response.onFaillure(
                                        error.localizedMessage ?: "Unknown error"
                                    )
                                )
                            }
                    }
                } else {
                    trySend(Response.onFaillure(errorHandyMen.localizedMessage ?: "Unknown error"))
                }
            }

        awaitClose {
            snapshot.remove()
        }
    }

    /* override fun getRequestByID(id: String): Flow<Response<Request>> = callbackFlow {
         Response.onLoading
         val snapshot = fireStore.collection("requests").document(id)
             .addSnapshotListener { value, error ->
                 val resp = if (value != null) {
                     val requestDTO = value.toObject(Request::class.java)
                     val request = Request(
                         requestDTO!!.requestID,
                         requestDTO!!.ClientId,
                         requestDTO.HandymanID,
                         requestDTO.Title,
                         requestDTO.Description,
                         requestDTO.Wilaya,
                         requestDTO.City,
                         requestDTO.Street,
                         requestDTO.Day,
                         requestDTO.Hour,
                         requestDTO.Budget,
                     )
                     Response.onSuccess(request)
                 } else Response.onFaillure(error?.localizedMessage ?: "Unknown error")
                 trySend(resp).isSuccess
             }
         awaitClose {
             snapshot.remove()
         }
     }*/

    override fun getRequestsByClientID(id: String): Flow<Response<List<Request>>> = callbackFlow {
        Response.onLoading
        val snapshot = fireStore.collection("requests")
            .whereEqualTo("clientId", id)
            .addSnapshotListener { value, error ->
                var requestsList = arrayListOf<Request>()
                val resp = if (error == null) {
                    if (value != null) {
                        value.documents.forEach {
                            val requestDTO = it.toObject(Request::class.java)
                            var req = Request(
                                requestDTO!!.ClientId,
                                requestDTO.HandymanID,
                                requestDTO.Title,
                                requestDTO.Description,
                                requestDTO.Wilaya,
                                requestDTO.City,
                                requestDTO.Street,
                                requestDTO.Day,
                                requestDTO.Hour,
                                requestDTO.Budget,
                            )
                            req.requestID = it.id
                            requestsList.add(req)
                            Log.i("Checkpoint", "something")
                        }
                        Response.onSuccess<List<Request>>(requestsList)
                    } else {
                        Response.onFaillure("there isn´t any requests for this client")
                    }
                } else {
                    Log.i("Checkpoint", "failed")
                    Response.onFaillure(
                        error.localizedMessage ?: "Unknown error"
                    )
                }
                trySend(resp).isSuccess
            }
        awaitClose {
            Log.i("Checkpoint", "removing snapshot")
            snapshot.remove()
        }
    }

    override fun getReqwithHandyman(id: String): Flow<Response<List<Booking>>> = callbackFlow {
        Response.onLoading
        val snapshot = fireStore.collection("requests")
            .whereEqualTo("clientId", id)
            .addSnapshotListener { value, error ->
                var requests = mutableListOf<Booking>()
                val resp = if (error == null) {
                    if (value != null) {
                        value.documents.forEach {
                            val req = it.toObject(Request::class.java)
                            req!!.requestID = it.id
                            var hand = HandyMan()
                            val snapshot = fireStore.collection("HandyMan").document(req.HandymanID)
                                .addSnapshotListener { value, error ->
                                    val respo = if (value != null) {
                                        val handyMenDTO = value.toObject(HandyMan::class.java)
                                        hand = HandyMan(
                                            handyMenDTO!!.Email,
                                            handyMenDTO.FirstName,
                                            handyMenDTO.LastName,
                                            handyMenDTO.Category,
                                            handyMenDTO.City,
                                            handyMenDTO.Wilaya,
                                            handyMenDTO.Rating,
                                            handyMenDTO.AverageSalary,
                                            handyMenDTO.ProfileImage,
                                            value.id,
                                            handyMenDTO.DeviceToken,
                                            handyMenDTO.Status,
                                        )
                                        Log.i("checker0", hand.LastName + hand.FirstName)
                                        Log.i("checker0", req.Title)
                                        requests.add(Booking(req, hand))
                                        Log.i("checker0", requests.toString())
                                        Response.onSuccess(requests)
                                    } else {
                                        Response.onFaillure(
                                            error?.localizedMessage ?: "Unknown error"
                                        )
                                    }
                                    //trySend(respo).isSuccess
                                }
                            Log.i("Checkpoint", "something")
                        }
                        Response.onSuccess<List<Booking>>(requests)
                    } else {
                        Response.onFaillure("there isn´t any requests for this client")
                    }
                } else {
                    Log.i("Checkpoint", "failed")
                    Response.onFaillure(
                        error.localizedMessage ?: "Unknown error"
                    )
                }
                trySend(resp).isSuccess
            }
        awaitClose {
            Log.i("Checkpoint", "removing snapshot")
            snapshot.remove()
        }
    }

    override fun getTaskWithHandyman(id: String): Flow<Response<List<BookingT>>> = callbackFlow {
        Response.onLoading
        val snapshot = fireStore.collection("tasks")
            .whereEqualTo("clientId", id)
            .addSnapshotListener { value, error ->
                var tasks = mutableListOf<BookingT>()
                val resp = if (error == null) {
                    if (value != null) {
                        value.documents.forEach {
                            Log.i("selim", it.id)
                            val tas = it.toObject(Task::class.java)
                            /*val tas =Task(
                                taskDTO!!.id,
                                taskDTO.HandyId,
                                taskDTO.client,
                                taskDTO.category,
                                taskDTO.title,
                                taskDTO.description,
                                taskDTO.time_day,
                                taskDTO.time_hour,
                                taskDTO.Price,
                                taskDTO.Willaya,
                                taskDTO.Address,
                                taskDTO.status,
                                taskDTO.longitude,
                                taskDTO.latitude,
                            )
                             */
                            tas!!.id = it.id
                            var hand = HandyMan()
                            val snapshot = fireStore.collection("HandyMan").document(tas.HandyId)
                                .addSnapshotListener { value, error ->
                                    val respo = if (value != null) {
                                        Log.i("selim", value.id)
                                        val handyMan = HandyManplusID()
                                        handyMan.HandymanId = tas.HandyId
                                        val handyMenDTO = value.toObject(HandyMan::class.java)
                                        handyMan.handyMan = HandyMan(
                                            FirstName = handyMenDTO!!.FirstName,
                                            LastName = handyMenDTO.LastName,
                                            Category = handyMenDTO.Category,
                                            AverageSalary = handyMenDTO.AverageSalary,
                                            ProfileImage = handyMenDTO.ProfileImage,
                                            id = value.id,
                                            PhoneNumber = handyMenDTO.PhoneNumber,
                                        )
                                        Log.i("Checkpoint", hand.LastName + hand.FirstName)
                                        Log.i("Checkpoint", tas.clientId)
                                        tasks.add(BookingT(tas, handyMan))
                                        Log.i("Checkpoint", tasks.toString())
                                        Response.onSuccess(tasks)
                                    } else {
                                        Response.onFaillure(
                                            error?.localizedMessage ?: "Unknown error"
                                        )
                                    }
                                    //trySend(respo).isSuccess
                                }
                            Log.i("Checkpoint", tas.clientId)
                        }
                        Response.onSuccess<List<BookingT>>(tasks)
                    } else {
                        Response.onFaillure("there isn´t any requests for this client")
                    }
                } else {
                    Log.i("Checkpoint", "failed")
                    Response.onFaillure(
                        error.localizedMessage ?: "Unknown error"
                    )
                }
                trySend(resp).isSuccess
            }
        awaitClose {
            Log.i("Checkpoint", "removing snapshot")
            snapshot.remove()
        }
    }


    /*
        override fun getRequestWithHandyman(id: String): Flow<Response<List<Booking>>> = callbackFlow {
            Response.onLoading
            val snapshot = fireStore.collection("requests")
                .whereEqualTo("clientId", id)
                .addSnapshotListener { value, error ->
                    var requests = mutableListOf<Booking>()
                    val resp = if (error == null) {
                        if (value != null) {
                            value.documents.forEach {
                                val requestDTO = it.toObject(Request::class.java)
                                var req = Request(
                                    requestDTO!!.ClientId,
                                    requestDTO.HandymanID,
                                    requestDTO.Title,
                                    requestDTO.Description,
                                    requestDTO.Wilaya,
                                    requestDTO.City,
                                    requestDTO.Street,
                                    requestDTO.Day,
                                    requestDTO.Hour,
                                    requestDTO.Budget,
                                )
                                req.requestID = it.id
                                var hand =HandyMan()
                                val snapshot = fireStore.collection("HandyMan").document(req.HandymanID)
                                    .addSnapshotListener { value, error ->
                                        val respo = if (value != null) {
                                            val handyMenDTO = value.toObject(HandyMan::class.java)
                                            hand = HandyMan(
                                                handyMenDTO!!.Email,
                                                handyMenDTO.FirstName,
                                                handyMenDTO.LastName,
                                                handyMenDTO.Category,
                                                handyMenDTO.City,
                                                handyMenDTO.Wilaya,
                                                handyMenDTO.Rating,
                                                handyMenDTO.AverageSalary,
                                                handyMenDTO.ProfileImage,
                                                value.id,
                                                handyMenDTO.DeviceToken,
                                                handyMenDTO.Status,
                                            )
                                            Log.i("checker0",hand.LastName+ hand.FirstName )
                                            Log.i("checker0",req.Title )
                                            requests.add(Booking(req,hand))
                                            Log.i("checker0",requests.toString())
                                            Response.onSuccess(requests)
                                        }
                                            else {Response.onFaillure(error?.localizedMessage ?: "Unknown error")}
                                            //trySend(respo).isSuccess
                                        }
                                Log.i("Checkpoint", "something")
                            }
                            Response.onSuccess<List<Booking>>(requests)
                        } else {
                            Response.onFaillure("there isn´t any requests for this client")
                        }
                    } else {
                        Log.i("Checkpoint", "failed")
                        Response.onFaillure(
                            error.localizedMessage ?: "Unknown error"
                        )
                    }
                    trySend(resp).isSuccess
                }
            awaitClose {
                Log.i("Checkpoint", "removing snapshot")
                snapshot.remove()
            }

        }
    */
    /* override fun getImages(id: String): Flow<Response<List<Uri>>> = callbackFlow{
         Response.onLoading
         val storage = FirebaseStorage.getInstance().reference
         val ref =storage.child("Request/${id}")
         var imagesList= ArrayList<Uri>()
         ref.listAll().addOnSuccessListener {listResults->
             for (item in listResults.items){
                 item.downloadUrl.addOnSuccessListener {uri->
                     imagesList.add(uri)
                     //Log.i("checker",imagesList.size.toString())
                 }
                     .addOnFailureListener {
                         Log.i("checker","error loading images")
                     }
             }
         }
         Response.onSuccess<List<Uri>>(imagesList)
     }*/

    override fun getGalleryImages(id: String): Flow<Response<List<String>>> = flow {
        emit(Response.onLoading)
        try {
            val db = FirebaseFirestore.getInstance()
            val storage = FirebaseStorage.getInstance().reference
            val ref = storage.child("HandyMan/$id/Portfolio").listAll().await()
            var imagesList = ArrayList<String>()
            for (item in ref.items) {
                val uri = item.downloadUrl.await()
                imagesList.add(uri.toString())
            }
            emit(Response.onSuccess(imagesList))


        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "error"))
        }

    }

    override fun removeSavedHandyMen(handyMenID: String): Flow<Boolean> = flow {
        try {
            fireStore.collection("Clients").document(auth.currentUser!!.uid)
                .update("SavedHandyMen", FieldValue.arrayRemove(handyMenID)).await()
            emit(true)
        } catch (e: Exception) {
            emit(false)
        }
    }

    override fun saveHandyMen(handyMenID: String): Flow<Boolean> = flow {
        try {
            fireStore.collection("Clients").document(auth.currentUser!!.uid)
                .update("SavedHandyMen", FieldValue.arrayUnion(handyMenID)).await()
            emit(true)
        } catch (e: Exception) {
            emit(false)
        }
    }

    override fun savedHandyManList(): Flow<Response<List<HandyMan>>> = flow {
        emit(Response.onLoading)
        try {
            val doc = fireStore.collection("Clients").document(auth.currentUser!!.uid).get().await()
            val resp: Response<List<HandyMan>> =
                if (doc.exists()) {
                    var savedHandyMan: ArrayList<HandyMan> = arrayListOf()
                    val savedHandyManUriList = doc.get("SavedHandyMen") as List<String>
                    savedHandyManUriList.forEach {
                        val handyMan = fireStore.collection("HandyMan").document(it).get().await()
                        val handyMen = handyMan.toObject(HandyMan::class.java)
                        savedHandyMan.add(handyMen!!)
                    }
                    Response.onSuccess(savedHandyMan)
                } else Response.onFaillure("HandyMen doesn't exist")
            emit(resp)
        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "error"))
        }

    }

    override fun getMessages(receiver: String): Flow<Response<List<Message>>> = callbackFlow {
        trySend(Response.onLoading)
        val snapshot = fireStore.collection("Messages")
            .where(
                Filter.or(
                    Filter.and(
                        Filter.equalTo("sender", auth.currentUser!!.uid),
                        Filter.equalTo("receiver", receiver)
                    ),
                    Filter.and(
                        Filter.equalTo("sender", receiver),
                        Filter.equalTo("receiver", auth.currentUser!!.uid)
                    )

                )
            ).addSnapshotListener { value, error ->
                GlobalScope.launch {
                    var messages = arrayListOf<Message>()
                    val resp: Response<List<Message>> =
                        if (error == null) {
                            if (value != null) {
                                //messages = value.toObjects(Message::class.java)
                                value.documents.forEach {
                                    val message = it.toObject(Message::class.java)
                                    //if (message?.type == "text") {
                                    if (message != null)
                                        messages.add(message)
                                    /*} else {
                                        val ref =
                                            storage.reference.child("Messages/${it.id}").listAll()
                                                .await()
                                        var imagesList = ArrayList<String>()
                                        for (item in ref.items) {
                                            val uri = item.downloadUrl.await()
                                            imagesList.add(uri.toString())
                                        }
                                        if (message != null) {
                                            if (imagesList.isNotEmpty())
                                                Log.d("img", imagesList[0] ?: "vide")
                                            messages.add(
                                                Message(
                                                    message.sender,
                                                    message.receiver,
                                                    message.text,
                                                    message.timestamp,
                                                    message.type,
                                                    imagesList
                                                )
                                            )

                                        }
                                    }*/
                                }
                            }
                            Response.onSuccess(messages)
                        } else Response.onFaillure(error.localizedMessage ?: "error")

                    trySend(resp).isSuccess
                }
            }
        awaitClose {
            snapshot.remove()
        }


    }

    override fun sendMessage(message: Message, images: List<Uri>): Flow<Response<Boolean>> = flow {
        try {
            emit(Response.onLoading)

            if (message.type == "images") {
                val doc = fireStore.collection("Messages").add(message).await()
                for (i in images.indices) {
                    storage.reference.child("Messages/${doc.id}/image${i + 1}.jpg")
                        .putFile(images[i]).addOnSuccessListener {
                            val uri = it.storage.downloadUrl.addOnSuccessListener {

                                fireStore.collection("Messages").document(doc.id)
                                    .update("images", FieldValue.arrayUnion(it))
                            }
                        }
                }
            } else fireStore.collection("Messages").add(message).await()
            emit(Response.onSuccess(true))
        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "error"))
        }

    }

    override fun getDeviceToken(id: String): Flow<Response<String>> = flow {
        emit(Response.onLoading)
        try {
            val client = fireStore.collection("HandyMan").document(id).get().await()
            if (client.exists()) {
                val token = client.get("DeviceToken").toString()
                emit(Response.onSuccess(token))
            }
        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "error"))
        }
    }

    override fun uploadMessageImages(id: String, images: List<Uri>): Flow<Response<Boolean>> =
        callbackFlow {
            Response.onLoading
            for (i in images.indices) {
                storage.reference.child("Messages/$id/image${i + 1}.jpg")
                    .putFile(images[i]).await()
            }
        }

    override fun getUserInfo(): Flow<Response<UserInfo?>> = callbackFlow {
        Response.onLoading
        val snapshot = fireStore.collection("Clients")
            .document(auth.currentUser!!.uid)
            .addSnapshotListener { value, error ->
                val resp: Response<UserInfo?> =
                    if (error == null) {
                        if (value != null) {
                            val userInfo = value.toObject(UserInfo::class.java)
                            Response.onSuccess(userInfo)
                        } else Response.onFaillure("no data")
                    } else Response.onFaillure(error.localizedMessage ?: "error")

                trySend(resp)
            }
        awaitClose {
            snapshot.remove()
        }
    }

    override fun updateUserInfo(userInfo: UserInfo): Flow<Response<Boolean>> = flow {
        try {
            emit(Response.onLoading)
            val f = fireStore.collection("Clients").document(auth.currentUser!!.uid)
                .update(
                    "FirstName", userInfo.FirstName,
                    "LastName", userInfo.LastName,
                    "PhoneNumber", userInfo.PhoneNumber
                ).await()
            emit(Response.onSuccess(true))

        } catch (e: Exception) {
            emit(Response.onFaillure(e.localizedMessage ?: "error"))
        }


    }

    override fun calculeRating(id: String): Flow<Response<HashMap<String, Any>>> = callbackFlow {
        trySend(Response.onLoading)

        val snapshot = fireStore.collection("Reviews").whereEqualTo("handyId", id)
            .addSnapshotListener { value, error ->

                if (error == null) {
                    if (value != null) {

                        var nbRating = mutableStateOf(0)


                        var ratingSum = mutableStateOf<Float>(0.toFloat())

                        value?.forEach { reviewDocument ->

                            val rating = reviewDocument.getDouble("value") ?: 0.0
                            //if (rating.isNotEmpty()) {
                            ratingSum.value = ratingSum.value + rating.toFloat()
                            //}

                            nbRating.value++


                        }
                        val rat: Float = ratingSum.value / value?.documents?.size!!
                        trySend(
                            Response.onSuccess(
                                hashMapOf(
                                    "Rating" to rat,
                                    "nbRating" to nbRating.value.toString()
                                )
                            )
                        )
                    } else trySend(
                        Response.onSuccess(
                            hashMapOf(
                                "Rating" to 0.toFloat(),
                                "nbRating" to ""
                            )
                        )
                    )
                } else {
                    trySend(Response.onFaillure(error.localizedMessage ?: "Unknown error"))
                }
            }

        awaitClose {
            snapshot.remove()
        }
    }

    override fun sendNotificationFireStore(notification: Notification): Flow<Response<Unit>> =
        flow {
            try {
                emit(Response.onLoading)
                fireStore.collection("HandyMan").document(notification.receiver)
                    .collection("Notification").document().set(
                        Notification(
                            notification.title,
                            notification.text,
                            auth.currentUser!!.uid,
                            notification.receiver,
                            notification.deepLink,
                            Timestamp.now()
                        )
                    ).await()
                emit(Response.onSuccess(Unit))
            } catch (e: Exception) {
                emit(Response.onFaillure(e.localizedMessage ?: "error"))
            }
        }

    override fun getNotificationFireStore(): Flow<Response<List<Notification>>> =
        callbackFlow {
            Response.onLoading
            val snapshot = fireStore.collection("Clients").document(auth.currentUser!!.uid)
                .collection("Notification").orderBy("time").addSnapshotListener { value, error ->
                    val resp: Response<List<Notification>> =
                        if (error == null) {
                            if (value != null) {
                                val notifications = value.toObjects(Notification::class.java)
                                Response.onSuccess(notifications)
                            } else {
                                Response.onFaillure("No notifications")
                            }
                        } else {
                            Response.onFaillure(error.localizedMessage ?: "error")
                        }
                    trySend(resp).isSuccess
                }
            awaitClose { snapshot.remove() }

        }

}

/*data class  (val rating : Float , val nbRating : Int)*/



