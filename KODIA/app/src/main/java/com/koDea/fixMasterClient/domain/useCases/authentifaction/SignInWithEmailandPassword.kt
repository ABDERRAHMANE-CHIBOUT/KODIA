package com.koDea.fixMasterClient.domain.useCases.authentifaction

import com.koDea.fixMasterClient.domain.repository.AuthRepository
import javax.inject.Inject

class signInWithEmailandPassword @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(email : String , password : String) = repository.signInWithEmailandPassword(email, password)
}