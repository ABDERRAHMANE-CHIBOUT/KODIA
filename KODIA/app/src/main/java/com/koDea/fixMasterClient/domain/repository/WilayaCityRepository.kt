package com.koDea.fixMasterClient.domain.repository

import com.koDea.fixMasterClient.data.remote.dto.WilayaCity.WilayaCity
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse

interface WilayaCityRepository {
    suspend fun getWilayaCity() : WilayaCity
}