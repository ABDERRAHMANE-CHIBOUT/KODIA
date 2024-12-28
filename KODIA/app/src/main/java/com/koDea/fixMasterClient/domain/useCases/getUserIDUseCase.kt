package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.domain.repository.AuthRepository
import javax.inject.Inject

class getUserIDUseCase @Inject constructor(val authRepository: AuthRepository) {
    operator fun invoke() = authRepository.getUserID()
}