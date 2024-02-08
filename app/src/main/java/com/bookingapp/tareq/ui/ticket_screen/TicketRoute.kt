package com.bookingapp.tareq.ui.ticket_screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.bookingapp.tareq.ui.navigation.Screen

private val ROUTE = Screen.TicketScreen.route
fun NavController.navigateToTicket() {
    navigate(ROUTE)
}

fun NavGraphBuilder.ticketRoute() {
    composable(ROUTE) { TicketScreen() }
}