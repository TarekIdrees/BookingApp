package com.bookingapp.tareq.ui.ticket_screen.comosables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.ticket_screen.TicketUiState
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import com.bookingapp.tareq.ui.theme.Gray

@Composable
fun FlightDetailsCard(
    modifier: Modifier = Modifier,
    state: TicketUiState
) {
    Card(
        modifier = modifier
            .clip(RoundedCornerShape(22.dp))
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .offset(y = (-130).dp),
                painter = painterResource(id = R.drawable.earth),
                contentDescription = "earth photo",
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp, top = 64.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        text = "Ticket Price",
                        style = MaterialTheme.typography.headlineSmall.copy(Gray)
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(
                            "$",
                            style = MaterialTheme.typography.displayMedium.copy(Color.Black)
                        )
                        Text(
                            text = state.flightInformation.ticketPrice,
                            style = MaterialTheme.typography.headlineLarge.copy(Color.Black)
                        )
                    }
                }
                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                ) {
                    drawLine(
                        color = Gray,
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f))
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(32.dp)) {
                        Column(
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                "Depart",
                                style = MaterialTheme.typography.headlineSmall.copy(Gray)
                            )
                            Text(
                                state.flightInformation.departDate,
                                style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                            )
                        }
                        Column(horizontalAlignment = Alignment.Start) {
                            Text(
                                "Arrive",
                                style = MaterialTheme.typography.headlineSmall.copy(Gray)
                            )
                            Text(
                                state.flightInformation.arriveDate,
                                style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                            )
                        }
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(32.dp)){
                        Column(horizontalAlignment = Alignment.Start) {
                            Text("Gate", style = MaterialTheme.typography.headlineSmall.copy(Gray))
                            Text(
                                state.flightInformation.gate,
                                style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                            )
                        }
                        Column(horizontalAlignment = Alignment.Start) {
                            Text("Seat", style = MaterialTheme.typography.headlineSmall.copy(Gray))
                            Text(
                                state.flightInformation.seatNumber,
                                style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                            )
                        }
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(32.dp)){
                        Column(horizontalAlignment = Alignment.Start) {
                            Text(
                                "Flight Number",
                                style = MaterialTheme.typography.headlineSmall.copy(Gray)
                            )
                            Text(
                                state.flightInformation.flightNumber,
                                style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                            )
                        }

                        Column(horizontalAlignment = Alignment.Start) {
                            Text("Class", style = MaterialTheme.typography.headlineSmall.copy(Gray))
                            Text(
                                state.flightInformation.flightClass,
                                style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                            )
                        }
                    }
                }

                Canvas(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                ) {
                    drawLine(
                        color = Gray,
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f))
                    )
                }
                Column(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Boarding Pass",
                        style = MaterialTheme.typography.displaySmall.copy(Color.Black)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Image(
                        modifier = Modifier.size(width = 246.dp, height = 88.dp),
                        painter = painterResource(id = R.drawable.barcode),
                        contentDescription = "barcode image",
                        contentScale = ContentScale.Crop
                    )
                }

            }
        }
    }

}

@Preview
@Composable
fun FlightDetailsCardPreview() {
    BookingAppTheme {
        FlightDetailsCard(state = TicketUiState())
    }
}