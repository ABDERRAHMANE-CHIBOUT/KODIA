package com.koDea.fixMasterClient.presentation.Review

import com.google.common.util.concurrent.AbstractIdleService

data class Review (
    var value:Float,
    val description:String,
    val handyId:String,
    val clientId:String
    )