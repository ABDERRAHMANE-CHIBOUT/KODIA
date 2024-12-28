package com.koDea.fixMasterClient.domain.useCases

import android.net.Uri
import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import com.koDea.fixMasterClient.presentation.Chat.Message
import javax.inject.Inject

class sendMessageUseCase @Inject constructor(val fireStoreRepository: FireStoreRepository) {
    operator fun invoke(message: Message , images : List<Uri>) = fireStoreRepository.sendMessage(message , images)
}