package com.koDea.fixMasterClient.data.repository

import com.koDea.fixMasterClient.data.remote.GeocodeReverseApi
import com.koDea.fixMasterClient.data.remote.WilayaCityAPI
import com.koDea.fixMasterClient.data.remote.dto.WilayaCity.WilayaCity
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse
import com.koDea.fixMasterClient.domain.repository.LocationRepository
import com.koDea.fixMasterClient.domain.repository.WilayaCityRepository
import javax.inject.Inject

class WilayaCityRepositoryImpl @Inject constructor (private val api : WilayaCityAPI) :
    WilayaCityRepository {
    override suspend fun getWilayaCity() : WilayaCity {
        return (api.getWilayaCity())
    }
}