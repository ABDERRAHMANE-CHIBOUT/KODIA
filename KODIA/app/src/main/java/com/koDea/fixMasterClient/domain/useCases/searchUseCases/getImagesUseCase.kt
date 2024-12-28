package com.koDea.fixMasterClient.domain.useCases.searchUseCases

import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class getImagesUseCase @Inject constructor(private val fireStoreRepository: FireStoreRepository){
   // operator fun invoke(id : String) = fireStoreRepository.getImages(id)
}