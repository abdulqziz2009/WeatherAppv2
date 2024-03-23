package com.salievyt1353.weatherappv2.data.responce

import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import com.salievyt1353.weatherappv2.BuildConfig.API_KEY
import com.salievyt1353.weatherappv2.data.model.BaseMainResponse
import com.salievyt1353.weatherappv2.data.model.CurrentDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiSevise {

    @GET("forecast.json")
    fun getWeather(
        @Query("key") apiKey :String = API_KEY,
        @Query("days") days: Int = 3,
        @Query("q") cityname :String = "Bishkek"
    ): Call<BaseMainResponse>
}