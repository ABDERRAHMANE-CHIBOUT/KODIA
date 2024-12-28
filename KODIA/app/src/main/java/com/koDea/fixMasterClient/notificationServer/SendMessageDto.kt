package com.koDea.fixMasterClient.notificationServer


data class SendMessageDto(
    val to: String? = "ci-ezl3XSBeYEBAblzg_-I:APA91bH6wTWWL5McH_tdQkZAxn-hOWZteOxRiHYBXwdeMxEyH5S-ApRI5eztiNVm3kSipPqCAZWOHQjGi816Z9qlLH-BUu9Eir35EyrL0a-G5JPX_mIJVnEoS5-npAOzYnKykU0FhxHT",
    val notification: NotificationBody
)

data class NotificationBody(
    val title: String,
    val body: String
)