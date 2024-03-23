package com.salievyt1353.weatherappv2.ui

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.salievyt1353.weatherappv2.data.model.BaseMainResponse
import com.salievyt1353.weatherappv2.data.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repository: WeatherRepository
): ViewModel() {
    var liveData =MediatorLiveData<BaseMainResponse>()
    fun getcurrentWeather() {
        liveData = repository.getWeather()
    }
}