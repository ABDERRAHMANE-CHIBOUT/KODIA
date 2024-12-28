package com.koDea.fixMasterClient.domain.local

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun saveAppEntry()
    fun readAppEntry() : Flow<Boolean>
}