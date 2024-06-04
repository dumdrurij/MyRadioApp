package com.example.myradioapp.network

import android.app.Fragment
import android.os.Bundle
import android.view.View
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class YourFragment: Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val call = RetrofitClient.apiService.getRadioStations()
        call.enqueue(object : Callback<List<RadioStation>> {
            override fun onResponse(
                call: Call<List<RadioStation>>,
                response: Response<List<RadioStation>>
            ) {

                if (response.isSuccessful) {
                    val radioStation = response.body()  //это обработка полученных радиостанций

                } else { //обработка ошибки

                }
            }

            override fun onFailure(call: Call<List<RadioStation>>, error: Throwable) {

           }         //тоже обработка ошибки
        })
    }

}




