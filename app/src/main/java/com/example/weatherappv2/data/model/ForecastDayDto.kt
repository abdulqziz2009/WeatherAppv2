package com.salievyt1353.weatherappv2.data.model

import com.google.gson.annotations.SerializedName

data class ForecastDayDto (
    val date : String,
    @SerializedName("date_epoch")
    val dateEpoch: String,
    val day: DayDto,
    val astro : AstroDto
)
