package com.koDea.fixMasterClient.domain.repository

import androidx.annotation.Keep
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse

@Keep
interface LocationRepository {
    suspend fun getLoscationInfo(lat : String , lon : String) : GeocodeReverseResponse
}