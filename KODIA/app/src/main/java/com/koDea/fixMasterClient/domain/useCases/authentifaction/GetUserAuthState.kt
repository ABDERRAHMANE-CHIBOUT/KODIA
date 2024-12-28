package com.koDea.fixMasterClient.domain.useCases.authentifaction

import com.koDea.fixMasterClient.domain.repository.AuthRepository
import javax.inject.Inject

class getUserAuthState @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke() = repository.getUserAuthState()
}