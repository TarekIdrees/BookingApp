package com.bookingapp.tareq.ui.navigation

sealed class Screen(val route: String) {
    data object HomeScreen: Screen("homeScreen")
    data object FlightScreen: Screen("flightScreen")
    data object TicketScreen: Screen("ticketScreen")
}