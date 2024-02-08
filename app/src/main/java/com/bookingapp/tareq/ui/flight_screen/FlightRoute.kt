package com.bookingapp.tareq.ui.flight_screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.bookingapp.tareq.ui.navigation.Screen

private val ROUTE = Screen.FlightScreen.route
fun NavController.navigateToFlight() {
    navigate(ROUTE)
}

fun NavGraphBuilder.flightRoute() {
    composable(ROUTE) { FlightScreen() }
}