package com.bookingapp.tareq.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.bookingapp.tareq.ui.flight_screen.flightRoute
import com.bookingapp.tareq.ui.home_screen.homeRoute
import com.bookingapp.tareq.ui.ticket_screen.ticketRoute

@Composable
fun MainNavGraph() {
    val navController = LocalNavigationProvider.current

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        homeRoute()
        flightRoute()
        ticketRoute()
    }
}