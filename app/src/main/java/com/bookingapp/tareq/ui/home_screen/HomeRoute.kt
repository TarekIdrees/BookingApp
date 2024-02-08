package com.bookingapp.tareq.ui.home_screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.bookingapp.tareq.ui.navigation.Screen

private val ROUTE = Screen.HomeScreen.route
fun NavController.navigateToHome() {
    navigate(ROUTE)
}

fun NavGraphBuilder.homeRoute() {
    composable(ROUTE) { HomeScreen() }
}