package com.koDea.fixMasterClient.notificationServer

data class ChatState(
    val isEnteringToken: Boolean = true,
    val remoteToken: String = "",
    val messageText: String = ""
)