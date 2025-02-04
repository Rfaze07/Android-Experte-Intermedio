package com.ondevs.horoscapp.data

import android.util.Log
import com.ondevs.horoscapp.data.network.HoroscopeApiService
import com.ondevs.horoscapp.data.network.response.PredictionResponse
import com.ondevs.horoscapp.domain.Repository
import com.ondevs.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImp @Inject constructor(private val apiService: HoroscopeApiService): Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess {  return it.toDomain()  }
            .onFailure {  Log.i("renzo", "Ha ocurrido un error ${it.message}") }
        return null
    }

}