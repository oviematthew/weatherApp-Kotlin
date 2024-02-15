package com.example.matthewenamuotormidterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.matthewenamuotormidterm.databinding.ActivityMainBinding
import com.example.matthewenamuotormidterm.network.RetrofitProvider
import com.example.matthewenamuotormidterm.network.WeatherService
import com.example.matthewenamuotormidterm.repository.WeatherRepository
import com.example.matthewenamuotormidterm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    private lateinit var weatherRepository: WeatherRepository
    private lateinit var weatherService: WeatherService
    private lateinit var city: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inflate the activity and set the contentView to the root of the xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()


        //onclick of fetch weather button start fetching weather details
        binding.fetchBtn.setOnClickListener {
            city = binding.locationField.text.toString()
            mainViewModel.fetchDataFromServer(weatherRepository, weatherService, city)
        }

        observeWeatherData()
    }

    private fun init() {
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        weatherService = RetrofitProvider.retrofitInstance.create(WeatherService::class.java)
        weatherRepository = WeatherRepository()
        city = binding.locationField.text.toString()
        mainViewModel.fetchDataFromServer(weatherRepository, weatherService, city)
    }

    private fun observeWeatherData() {
        mainViewModel.weatherLiveData.observe(this) { response ->

                val weatherData = response.body()
                // Update UI with weatherData
                binding.cityDetails.text =
                    "${weatherData?.resolvedAddress}  ${weatherData?.days?.get(0)?.datetime}"

                binding.currentTemp.text = "Current Temperature: ${weatherData?.currentConditions?.temp}"

                binding.maxTemp.text = "Todays Maximum Temperature: ${weatherData?.days?.get(0)?.tempmax}"

                binding.minTemp.text = "Todays Minimum Temperature: ${weatherData?.days?.get(0)?.tempmin}"

                binding.probPrecipitation.text = "Probability Of Precipitation: ${weatherData?.days?.get(0)?.precipprob}"

                binding.todaysDesc.text = "Probability Of Precipitation: ${weatherData?.days?.get(0)?.description}"

        }
    }
}