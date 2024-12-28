package com.koDea.fixMasterClient.domain.useCases

import com.koDea.fixMasterClient.data.remote.dto.WilayaCity.WilayaCity
import com.koDea.fixMasterClient.domain.repository.WilayaCityRepository
import com.koDea.fixMasterClient.util.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetWilayaCityUseCases @Inject constructor(private  val wilayaCityRepository: WilayaCityRepository) {
    operator fun invoke(lat : String , lon : String) : Flow<Response<WilayaCity>> = flow {
        try {
            emit(Response.onLoading)
            val data = wilayaCityRepository.getWilayaCity()
            emit(Response.onSuccess(data))
        }catch (e: HttpException){
            emit(Response.onFaillure(e.localizedMessage?: "Unexpected error"))
        }catch (e: IOException){
            emit(Response.onFaillure("Couldn't reach server check your internet"))
        }
    }
}