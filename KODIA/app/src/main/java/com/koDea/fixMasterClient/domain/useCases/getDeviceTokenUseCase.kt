package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class getDeviceTokenUseCase @Inject constructor(val fireStoreRepository: FireStoreRepository) {
    operator fun invoke(id : String) = fireStoreRepository.getDeviceToken(id)
}