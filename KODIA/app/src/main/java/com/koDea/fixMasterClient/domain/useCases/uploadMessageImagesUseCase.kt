package com.koDea.fixMasterClient.domain.useCases

import android.net.Uri
import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class uploadMessageImagesUseCase @Inject constructor(val fireStoreRepository: FireStoreRepository) {
    operator fun invoke(id : String , images : List<Uri>) = fireStoreRepository.uploadMessageImages(id ,images)
}