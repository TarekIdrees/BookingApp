package com.bookingapp.tareq.ui.presentation.flight_screen

data class FlightScreenUiState(
    val startFlight: FlightUiState = FlightUiState(),
    val destinationFlight: FlightUiState = FlightUiState(),
    val startDate: String = "",
    val endDate: String = "",
    val flightClass: String = "",
)

data class FlightUiState(
    val countryShortcut: String = "",
    val country: String = "",
    val countryTime: String = "",
)