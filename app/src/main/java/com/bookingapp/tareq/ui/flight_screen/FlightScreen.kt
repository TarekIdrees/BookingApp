package com.bookingapp.tareq.ui.flight_screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.common_composables.BookingTopAppbar
import com.bookingapp.tareq.ui.common_composables.NavigationHandler
import com.bookingapp.tareq.ui.common_composables.RowHeadline
import com.bookingapp.tareq.ui.flight_screen.composables.AirplaneRouteDisplay
import com.bookingapp.tareq.ui.flight_screen.composables.DisplayText
import com.bookingapp.tareq.ui.flight_screen.composables.FlightClassCard
import com.bookingapp.tareq.ui.flight_screen.composables.FlightInformationCard
import com.bookingapp.tareq.ui.common_composables.RoundedTicketButton
import com.bookingapp.tareq.ui.flight_screen.composables.SearchFlightCard
import com.bookingapp.tareq.ui.flight_screen.composables.TimeScaffold
import com.bookingapp.tareq.ui.theme.Black80
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import com.bookingapp.tareq.ui.ticket_screen.navigateToTicket

@Composable
fun FlightScreen(
    viewModel: FlightViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val context = LocalContext.current
    NavigationHandler(effects = viewModel.effect, handleEffect = { effect, navController ->
        when (effect) {
            FlightUiEffect.NavigationToTicketEffect -> navController.navigateToTicket()
            FlightUiEffect.showInCompleteScreenToast -> Toast.makeText(
                context,
                "The screen not implemented yet",
                Toast.LENGTH_LONG
            ).show()
        }
    })
    FlightContent(viewModel, state = state)
}

@Composable
private fun FlightContent(
    viewModel: FlightViewModel,
    state: FlightScreenUiState
) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        BackgroundSchema()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(state = scrollState)
        ) {
            Row(
                modifier = Modifier
                    .height(290.dp)
                    .fillMaxWidth()
            ) {
                AirplaneRouteDisplay()
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, bottom = 16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Planned Flight", style = MaterialTheme.typography.displaySmall)
                        BookingTopAppbar()
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        DisplayText(
                            labelText = "From ${state.startFlight.countryShortcut}",
                            informationText = state.startFlight.country
                        )
                        TimeScaffold(
                            time = state.startFlight.countryTime,
                            locationShortcut = state.startFlight.countryShortcut
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        DisplayText(
                            labelText = "To ${state.destinationFlight.countryShortcut}",
                            informationText = state.destinationFlight.country
                        )
                        TimeScaffold(
                            time = state.destinationFlight.countryTime,
                            locationShortcut = state.destinationFlight.countryShortcut
                        )
                    }

                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                RoundedTicketButton(
                    modifier = Modifier
                        .weight(0.5f)
                        .padding(end = 16.dp),
                    text = "One Way",
                    onClick = viewModel::onClickOneWayButton
                )
                RoundedTicketButton(
                    modifier = Modifier.weight(0.5f),
                    text = "Round Trip",
                    isThereBorder = true,
                    textColor = Color.Black,
                    background = Color.White,
                    onClick = viewModel::onClickRoundTripButton
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            FlightInformationCard(departTime = state.startDate, arriveTime = state.endDate)
            Spacer(modifier = Modifier.height(16.dp))
            FlightClassCard(flightClass = state.flightClass)
            Spacer(modifier = Modifier.height(16.dp))
            SearchFlightCard(onClickButton = viewModel::onClickSearchFlightButton)
            Spacer(modifier = Modifier.height(16.dp))
            RowHeadline(headline = "Offers", onClickSeeAll = viewModel::onClickOffersSeeAll)
            Spacer(modifier = Modifier.height(4.dp))
            state.offersImage.forEach { id ->
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { viewModel.onClickOfferCard() },
                    painter = painterResource(id = id),
                    contentDescription = "offer photo",
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Composable
private fun BackgroundSchema() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.8f)
                .background(color = Color.Black)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                painter = painterResource(R.drawable.art), contentDescription = "",
                contentScale = ContentScale.FillBounds
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Black80)
        ) {}
    }
}

@Preview
@Composable
fun FlightScreenPreview() {
    BookingAppTheme {
        FlightScreen()
    }
}