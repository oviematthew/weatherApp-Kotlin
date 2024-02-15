package com.example.matthewenamuotormidterm.repository

import com.example.matthewenamuotormidterm.network.WeatherService
import com.example.matthewenamuotormidterm.model.WeatherData
import retrofit2.Response

class WeatherRepository {
    suspend fun fetchDataFromServer(weatherService: WeatherService, city: String): Response<WeatherData> {
        return weatherService.getWeather(city)
    }
}
