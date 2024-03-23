package com.salievyt1353.weatherappv2.data.repository

import android.util.Log
import androidx.lifecycle.MediatorLiveData
import com.salievyt1353.weatherappv2.data.model.BaseMainResponse
import com.salievyt1353.weatherappv2.data.model.CurrentDto
import com.salievyt1353.weatherappv2.data.responce.ApiSevise
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiService: ApiSevise) {

    fun getWeather(): MediatorLiveData<BaseMainResponse>{
        val liveData = MediatorLiveData<BaseMainResponse>()
        apiService.getWeather().enqueue(object : Callback<BaseMainResponse>{
            override fun onResponse(call: Call<BaseMainResponse>, response: Response<BaseMainResponse>) {
                if (response.isSuccessful){
                    liveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<BaseMainResponse>, t: Throwable) {
                t.message?.let { Log.e("currentWeather" , it) }
            }


        })
        return liveData
    }
}