package com.example.matthewenamuotormidterm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.matthewenamuotormidterm.model.WeatherData
import com.example.matthewenamuotormidterm.network.WeatherService
import com.example.matthewenamuotormidterm.repository.WeatherRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel : ViewModel() {
    val weatherLiveData = MutableLiveData<Response<WeatherData>>()

    fun fetchDataFromServer(repository: WeatherRepository, weatherService: WeatherService, city: String) {
        viewModelScope.launch {
                val weatherData = repository.fetchDataFromServer(weatherService, city)
                weatherLiveData.value = weatherData
        }
    }
}
