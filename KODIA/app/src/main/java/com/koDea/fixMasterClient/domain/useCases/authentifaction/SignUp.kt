package com.koDea.fixMasterClient.domain.useCases.authentifaction

import com.koDea.fixMasterClient.domain.repository.AuthRepository
import javax.inject.Inject

class signUp @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(FirstName : String , LastName : String , Email : String , PhoneNumber : String , Password : String) = repository.signUp(FirstName, LastName, Email, PhoneNumber, Password)
}