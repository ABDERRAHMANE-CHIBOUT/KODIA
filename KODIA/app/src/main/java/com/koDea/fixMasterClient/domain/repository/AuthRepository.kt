package com.koDea.fixMasterClient.domain.repository

import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
     fun signInWithEmailandPassword(email : String , password : String) : Flow<Response<Boolean>>
     fun signUp(FirstName : String , LastName : String , Email : String , PhoneNumber : String , Password : String) : Flow<Response<Boolean>>
     fun signOut() : Flow<Response<Boolean>>
     fun isUserAuth() : Boolean
     fun getUserAuthState() : Flow<Boolean>
     fun getUserID() : String
}