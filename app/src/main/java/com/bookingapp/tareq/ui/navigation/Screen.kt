package com.bookingapp.tareq.ui.navigation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("homeScreen")
    object FlightScreen: Screen("flightScreen")
    object TicketScreen: Screen("ticketScreen")
}