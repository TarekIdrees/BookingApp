package com.bookingapp.tareq.ui.presentation.flight_screen.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
fun SearchFlightCard(
    modifier: Modifier = Modifier,
    onClickButton: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .size(width = 398.dp, height = 52.dp)
            .clickable { onClickButton() },
        colors = CardDefaults.cardColors(containerColor = Brand),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "Search Flight",
                style = MaterialTheme.typography.displaySmall.copy(color = Color.Black)
            )
        }

    }
}

@Preview
@Composable
fun SearchFlightCardPreview() {
    BookingAppTheme {
        SearchFlightCard()
    }
}