package com.bookingapp.tareq.ui.ticket_screen

import com.bookingapp.tareq.data.models.Flight

data class TicketUiState(
    val locationShortcut: String = "",
    val destinationShortcut: String = "",
    val flightInformation: FlightInformation = FlightInformation()
)

data class FlightInformation(
    val estimatedFlightTime: String = "",
    val ticketPrice: String = "",
    val departDate: String = "",
    val gate: String = "",
    val flightNumber: String = "",
    val arriveDate: String = "",
    val seatNumber: String = "",
    val flightClass: String = "",
    val barcodeImage: Int = 0
)

fun Flight.toFlightUiState(): FlightInformation{
    return FlightInformation(
        estimatedFlightTime = estimatedFlightTime,
        ticketPrice = price,
        departDate = departDate,
        gate = gate,
        flightNumber = flightNumber,
        arriveDate = arriveDate,
        seatNumber = seat,
        flightClass = flightClass,
        barcodeImage = barcode
    )
}