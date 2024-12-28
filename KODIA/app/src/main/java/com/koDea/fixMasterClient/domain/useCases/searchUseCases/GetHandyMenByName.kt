package com.koDea.fixMasterClient.domain.useCases.searchUseCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class getHandyMenByName @Inject constructor (private val fireStoreRepository: FireStoreRepository) {
    operator fun invoke(text : String) = fireStoreRepository.getHandyManByName(text)
}