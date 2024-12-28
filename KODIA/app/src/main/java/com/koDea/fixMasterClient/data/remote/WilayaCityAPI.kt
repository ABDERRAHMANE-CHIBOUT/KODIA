package com.koDea.fixMasterClient.data.remote

import com.koDea.fixMasterClient.data.remote.dto.WilayaCity.WilayaCity
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WilayaCityAPI {
    @GET("statesc")
    suspend fun getWilayaCity(

    ): WilayaCity
}

//https://api.galataluxe.com/statesc