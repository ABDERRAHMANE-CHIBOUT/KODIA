package com.koDea.fixMasterClient.domain.useCases.locationUseCases

import androidx.annotation.Keep
import com.koDea.fixMasterClient.data.remote.dto.geoCodeReverse.GeocodeReverseResponse
import com.koDea.fixMasterClient.domain.repository.LocationRepository
import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

@Keep
class GetLocationUseCases @Inject constructor(private  val locationRepository: LocationRepository) {
    operator fun invoke(lat : String , lon : String) : Flow<Response<GeocodeReverseResponse>> = flow {
        try {
            emit(Response.onLoading)
            val data = locationRepository.getLoscationInfo(lat, lon)
            emit(Response.onSuccess(data))
        }catch (e: HttpException){
            emit(Response.onFaillure(e.localizedMessage?: "Unexpected error"))
        }catch (e: IOException){
            emit(Response.onFaillure("Couldn't reach server check your internet"))
        }
    }
}
