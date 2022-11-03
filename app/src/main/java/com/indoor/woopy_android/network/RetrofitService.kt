package com.indoor.woopy_android.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    companion object {


        val BASE_URL : String = "http://family.emirim.kr:8081/"
        var userAPI : UserAPI

        val retrofit : Retrofit
            get() = Retrofit.Builder()
                .baseUrl(BASE_URL)
                //.addConverterFactory(NullOnEmptyConverter())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        init {
            userAPI = retrofit.create(UserAPI::class.java)
        }

    }
}