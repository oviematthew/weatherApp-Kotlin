package com.example.matthewenamuotormidterm.network


import com.example.matthewenamuotormidterm.model.WeatherData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface WeatherService {
    @GET("VisualCrossingWebServices/rest/services/timeline/{city}?unitGroup=metric&key=BNR9A4ND6HNMB3WX2RTE7R63Q&contentType=json")
    suspend fun getWeather(@Path("city") city: String): Response<WeatherData>
}git