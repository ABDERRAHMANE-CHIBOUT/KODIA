package com.koDea.fixMasterClient.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.koDea.fixMasterClient.domain.local.LocalUserManager
import kotlinx.coroutines.flow.Flow
import com.koDea.fixMasterClient.util.Constants.Settings
import com.koDea.fixMasterClient.util.Constants.AppEntry
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class localUserManagerImp @Inject constructor(private val context: Context) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit {
            it[preferencesKey.appEntry] = true
        }
    }
    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map {
            it[preferencesKey.appEntry] ?: false
        }
    }

}

val Context.dataStore: DataStore<androidx.datastore.preferences.core.Preferences> by preferencesDataStore(
    name = Settings
)

private object preferencesKey {
    val appEntry = booleanPreferencesKey(name = AppEntry)
}