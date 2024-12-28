package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class removeSavedHandyMenUseCase @Inject constructor(private val fireStoreRepository: FireStoreRepository) {
    operator fun invoke( handyMenID : String) = fireStoreRepository.removeSavedHandyMen( handyMenID)
}