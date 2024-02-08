package com.bookingapp.tareq.ui.ticket_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.common_composables.NavigationHandler
import com.bookingapp.tareq.ui.ticket_screen.comosables.FlightDetailsCard
import com.bookingapp.tareq.ui.ticket_screen.comosables.FlightInformationRow

@Composable
fun TicketScreen(viewModel: TicketViewModel = hiltViewModel()) {

    val state by viewModel.state.collectAsState()
    NavigationHandler(effects = viewModel.effect, handleEffect = { effect, navController ->
        when (effect) {
            TicketUiEffect.BackButtonEffect -> navController.navigateUp()
        }
    })
    TicketContent(viewModel, state)
}

@Composable
fun TicketContent(viewModel: TicketViewModel, state: TicketUiState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Icon(
            modifier = Modifier.clickable { viewModel.onClickBackButton() },
            painter = painterResource(id = R.drawable.ic_left_arrow),
            contentDescription = "back arrow",
            tint = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Boarding Pass",
            style = MaterialTheme.typography.headlineLarge.copy(Color.White)
        )
        Spacer(modifier = Modifier.height(38.dp))
        FlightInformationRow(
            locationShortcut = state.locationShortcut,
            destinationShortcut = state.destinationShortcut,
            estimatedFlightTime = state.flightInformation.estimatedFlightTime
        )
        Spacer(modifier = Modifier.height(28.dp))
        FlightDetailsCard(
            modifier = Modifier.fillMaxHeight(),
            state = state
        )
    }
}
