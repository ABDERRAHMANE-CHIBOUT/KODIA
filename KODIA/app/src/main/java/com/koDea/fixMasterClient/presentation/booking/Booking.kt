package com.koDea.fixMasterClient.presentation.booking

import com.koDea.fixMasterClient.domain.model.HandyMan
import com.koDea.fixMasterClient.domain.model.Request

data class Booking(
    var request: Request,
    val handyman:HandyMan,
)
