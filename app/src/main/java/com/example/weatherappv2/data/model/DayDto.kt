package com.salievyt1353.weatherappv2.data.model

import com.google.gson.annotations.SerializedName

data class DayDto (
    @SerializedName("maxtemp_c")
    val maxTempC : String,
    @SerializedName("mintemp_c")
    val mminTempC : String,
    @SerializedName("maxwind_kph")
    val maxWindKph : String,
    val condition : ConditionForecastDto

)
