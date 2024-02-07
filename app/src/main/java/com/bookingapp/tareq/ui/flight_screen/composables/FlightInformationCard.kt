package com.bookingapp.tareq.ui.flight_screen.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.theme.Brand
import com.bookingapp.tareq.ui.theme.White

@Composable
fun FlightInformationCard(
    modifier: Modifier = Modifier,
    departTime: String,
    arriveTime: String
) {
    Card(
        modifier = modifier
            .size(width = 398.dp, height = 92.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Black),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Depart",
                    style = MaterialTheme.typography.labelSmall.copy(color = White)
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    text = departTime,
                    style = MaterialTheme.typography.titleSmall.copy(color = Brand)
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_calendar),
                contentDescription = "date icon",
                tint = Color.White
            )
            Column {
                Text(
                    modifier = Modifier.align(Alignment.End),
                    text = "Arrive",
                    style = MaterialTheme.typography.labelSmall.copy(color = White)
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    text = arriveTime,
                    style = MaterialTheme.typography.titleSmall.copy(color = Brand)
                )
            }
        }
    }
}

@Preview
@Composable
private fun FlightInformationCardPreview() {
    FlightInformationCard(departTime = "Sun, Jul 23", arriveTime = "Mon, Jul 24")
}