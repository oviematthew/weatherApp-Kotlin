package com.example.matthewenamuotormidterm.model

data class Day(
    val datetime: String,
    val temp: Double,
    val tempmax: Double,
    val tempmin: Double,
    val description: String,
    val conditions: String,
    val precipprob: Double,
)
