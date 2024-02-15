package com.example.matthewenamuotormidterm.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// Retrofit Singleton
object RetrofitProvider {
    private val BASE_URL = "https://weather.visualcrossing.com/"

    val retrofitInstance by lazy { getRetrofit() }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create(GsonBuilder().create())
            )
            .build()
    }
}