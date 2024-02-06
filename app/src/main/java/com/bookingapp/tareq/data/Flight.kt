package com.bookingapp.tareq.data

data class Flight(
    val startCountryShortcut: String = "",
    val startCountry: String = "",
    val startTime: String = "",
    val destinationCountryShortcut: String = "",
    val destinationCountry: String = "",
    val arrivingTime: String = "",
    val departDate: String = "",
    val arriveDate: String = "",
    val flightNumber: String = "",
    val flightClass: String = "",
    val estimatedFlightTime: String = "",
    val gate: String = "",
    val seat: String = "",
    val price: String = ""
)
