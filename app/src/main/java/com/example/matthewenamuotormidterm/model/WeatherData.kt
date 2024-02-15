package com.example.matthewenamuotormidterm.model

data class WeatherData(
    val resolvedAddress: String,
    val currentConditions: CurrentConditions,
    val days: List<Day>,
    val description: String,
    val timezone: String,
)
