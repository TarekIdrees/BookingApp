package com.bookingapp.tareq.ui.presentation.flight_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import com.bookingapp.tareq.ui.theme.Brand

@Composable
fun FlightClassCard(
    modifier: Modifier = Modifier,
    flightClass: String
) {
    Card(
        modifier = modifier
            .size(width = 398.dp, height = 92.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Black),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(top = 22.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = "Traveller & Class", style = MaterialTheme.typography.labelSmall)
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = flightClass,
                style = MaterialTheme.typography.titleSmall.copy(color = Brand)
            )
        }
    }
}

@Preview
@Composable
fun FlightClassCardPreview(){
    BookingAppTheme {
        FlightClassCard(flightClass = "1, Economy/Premium Economy")
    }
}