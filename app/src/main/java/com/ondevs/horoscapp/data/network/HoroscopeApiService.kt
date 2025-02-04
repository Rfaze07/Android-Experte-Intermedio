package com.ondevs.horoscapp.data.network

import com.ondevs.horoscapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}/?lang=es")
    suspend fun getHoroscope(@Path("sign")sign:String):PredictionResponse


}