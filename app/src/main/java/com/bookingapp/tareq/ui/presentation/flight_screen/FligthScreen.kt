package com.bookingapp.tareq.ui.presentation.flight_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun FlightScreen(
    viewModel: FlightViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
}