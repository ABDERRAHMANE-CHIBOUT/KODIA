package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class getMessagesUseCase @Inject constructor(val fireStoreRepository: FireStoreRepository){
    operator fun invoke(receiver : String) = fireStoreRepository.getMessages(receiver)
}