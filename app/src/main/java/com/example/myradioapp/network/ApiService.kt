package com.example.myradioapp.network

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("")// вот сюда добавлю путь вот такого вида(breed/hound/images)
    fun getRadioStations(): Call<List<RadioStation>>
}




