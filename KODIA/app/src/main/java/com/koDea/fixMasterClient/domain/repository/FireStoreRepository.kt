package com.koDea.fixMasterClient.domain.repository

import android.net.Uri
import com.google.firebase.Timestamp
import com.koDea.fixMasterClient.domain.model.Category
import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.Notification
import com.koDea.fixMasterClient.domain.model.ProfileHandyMenInfo
import com.koDea.fixMasterClient.domain.model.Review
import com.koDea.fixMasterClient.domain.model.Request
import com.koDea.fixMasterClient.domain.model.UserInfo
import com.koDea.fixMasterClient.presentation.Chat.Message
import com.koDea.fixMasterClient.presentation.booking.Booking
import com.koDea.fixMasterClient.presentation.booking.Tasks.BookingT
import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.flow.Flow

interface FireStoreRepository {
    // fun getCategories() : Flow<Response<Category>>
     fun getCategories() : Flow<Response<List<Category>>>
     fun getLimitCategories() : Flow<Response<List<Category>>>
     fun getLimitHandyManList() : Flow<Response<List<HandyMan>>>
     fun getHandyManList() : Flow<Response<List<HandyMan>>>
     fun getBestRatingHandyMen() : Flow<Response<HandyMan>>
     fun getBestSalaryHandyMen() : Flow<Response<HandyMan>>
     fun getHandyMenByID(id : String) : Flow<Response<HandyMan>>
     fun getHandyManByName(text : String) : Flow<Response<List<HandyMan>>>
     fun getHandyManByCategory(text : String) : Flow<Response<List<HandyMan>>>
     fun getHandyManByLocation(text : String) : Flow<Response<List<HandyMan>>>
     fun getProfileHandyManInfo(id:String) : Flow<Response<ProfileHandyMenInfo>>
     fun getHandyMenReviews(id:String) : Flow<Response<List<Review>>>
     fun getRequestsByClientID(id :String) :Flow<Response<List<Request>>>
    // fun getImages(id :String):Flow<Response<List<Uri>>>
     //fun getRequestWithHandyman(id :String) :Flow<Response<List<Booking>>>
    //fun get(id :String) :Flow<Response<List<Booking>>>
     fun getReqwithHandyman(id:String):Flow<Response<List<Booking>>>
     fun getTaskWithHandyman(id:String):Flow<Response<List<BookingT>>>
     fun getGalleryImages(id : String) : Flow<Response<List<String>>>
     fun removeSavedHandyMen(handyMenID : String) : Flow<Boolean>
     fun saveHandyMen(handyMenID : String) : Flow<Boolean>
     fun savedHandyManList() : Flow<Response<List<HandyMan>>>
     fun getMessages(receiver : String) : Flow<Response<List<Message>>>
     fun sendMessage(message: Message , images: List<Uri>) : Flow<Response<Boolean>>
     fun getDeviceToken(id : String) : Flow<Response<String>>
     fun uploadMessageImages(id: String , images : List<Uri>) : Flow<Response<Boolean>>
     fun getUserInfo() : Flow<Response<UserInfo?>>
     fun updateUserInfo(userInfo : UserInfo) : Flow<Response<Boolean>>
     fun calculeRating(id : String) : Flow<Response<HashMap<String , Any>>>
     fun sendNotificationFireStore(notification: Notification) : Flow<Response<Unit>>
     fun getNotificationFireStore() : Flow<Response<List<Notification>>>

}