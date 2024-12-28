package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.model.UserInfo
import com.koDea.fixMasterClient.domain.repository.FireStoreRepository
import javax.inject.Inject

class updateUserInfoUseCase @Inject constructor(private val fireStoreRepository: FireStoreRepository) {
    operator fun invoke(userInfo : UserInfo) = fireStoreRepository.updateUserInfo(userInfo)
}