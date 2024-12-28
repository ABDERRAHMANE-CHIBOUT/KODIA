package com.koDea.fixMasterClient.domain.useCases



import com.koDea.fixMasterClient.domain.model.Notification
import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class sendNotificationFirestoreUseCase @Inject constructor(private val fireStoreRepository: FireStoreRepository) {
    operator fun invoke(notification : Notification) = fireStoreRepository.sendNotificationFireStore(notification)
}