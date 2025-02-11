package com.ondevs.horoscapp.motherobject

import com.ondevs.horoscapp.data.network.response.PredictionResponse
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Aries
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Leo
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Libra
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.ondevs.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")


    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces)
}