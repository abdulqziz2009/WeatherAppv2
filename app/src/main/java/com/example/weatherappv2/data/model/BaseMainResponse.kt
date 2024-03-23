package com.salievyt1353.weatherappv2.data.model

data class BaseMainResponse(
    val location: LocationDto,
    val current : CurrentDto,
    val forecast: ForecastDto
)
