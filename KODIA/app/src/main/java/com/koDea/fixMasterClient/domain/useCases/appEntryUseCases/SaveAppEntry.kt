package com.koDea.fixMasterClient.domain.useCases.appEntryUseCases

import com.koDea.fixMasterClient.domain.local.LocalUserManager
import javax.inject.Inject

class saveAppEntry @Inject constructor(private val localUserManager: LocalUserManager) {
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}