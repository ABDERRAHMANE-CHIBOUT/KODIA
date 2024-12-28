package com.koDea.fixMasterClient

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

import com.onesignal.OneSignal
import com.onesignal.debug.LogLevel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

const val ONESIGNAL_APP_ID = "c488fbb1-5a81-4c61-8ed9-13a60379241f"
@HiltAndroidApp
class FixMasterApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        // Verbose Logging set to help debug issues, remove before releasing your app.
        OneSignal.Debug.logLevel = LogLevel.VERBOSE

        // OneSignal Initialization
        OneSignal.initWithContext(this, ONESIGNAL_APP_ID)

        // requestPermission will show the native Android notification permission prompt.
        // NOTE: It's recommended to use a OneSignal In-App Message to prompt instead.
        CoroutineScope(Dispatchers.IO).launch {
            OneSignal.Notifications.requestPermission(true)
        }
    }

}