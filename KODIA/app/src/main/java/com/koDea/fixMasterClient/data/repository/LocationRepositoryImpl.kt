package com.koDea.fixMasterClient.data.repository

import com.koDea.fixMasterClient.data.remote.GeocodeReverseApi
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse
import com.koDea.fixMasterClient.domain.repository.LocationRepository
import javax.inject.Inject


class LocationRepositoryImpl @Inject constructor (private val api : GeocodeReverseApi) :
    LocationRepository {
    override suspend fun getLoscationInfo(lat : String , lon : String) : GeocodeReverseResponse {
        return (api.getLocationInfo(lat, lon))
    }
}
