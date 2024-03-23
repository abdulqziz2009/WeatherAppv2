package com.salievyt1353.weatherappv2.data.model

import com.google.gson.annotations.SerializedName

data class LocationDto(
    val name : String,
    val country:String,
    @SerializedName("tz_id")
    val zoneId : String,
    @SerializedName("localtime_epoch")
    val localEpoch : String
)
