package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


class saveHandyMenUseCase @Inject constructor(private val fireStoreRepository: FireStoreRepository) {
    operator fun invoke( handyMenID : String) = fireStoreRepository.saveHandyMen(handyMenID)
}