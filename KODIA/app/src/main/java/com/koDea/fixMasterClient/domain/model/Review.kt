package com.koDea.fixMasterClient.domain.model

data class Review(
    val FirstName : String = "",
    val LastName : String = "",
    val Description : String = "",
    val Timestamp : String = "",
    val Rating : Float = 0.0.toFloat()
)
