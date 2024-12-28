package com.koDea.fixMasterClient.domain.useCases.appEntryUseCases

import com.koDea.fixMasterClient.domain.local.LocalUserManager
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class readAppEntry @Inject constructor(private val localUserManager: LocalUserManager) {
     operator fun invoke() : Flow<Boolean>{
        return localUserManager.readAppEntry()
    }
}