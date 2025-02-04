package com.ondevs.horoscapp.domain

import com.ondevs.horoscapp.data.network.response.PredictionResponse
import com.ondevs.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}