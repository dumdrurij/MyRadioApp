package com.example.myradioapp.network

import com.google.gson.annotations.SerializedName

data class RadioStation(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)



