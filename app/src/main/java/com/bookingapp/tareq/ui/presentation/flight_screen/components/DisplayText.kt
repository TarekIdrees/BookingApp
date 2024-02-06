package com.bookingapp.tareq.ui.presentation.flight_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bookingapp.tareq.ui.theme.BookingAppTheme

@Composable
fun DisplayText(
    modifier: Modifier = Modifier,
    labelText: String,
    informationText: String
) {
    Column(
        modifier = modifier.background(MaterialTheme.colorScheme.background)
    ) {
        Text(text = labelText, style = MaterialTheme.typography.labelSmall)
        Text(text = informationText, style = MaterialTheme.typography.displayLarge)
    }
}

@Preview(showBackground = true)
@Composable
private fun DisplayTextPreview() {
    BookingAppTheme {
        DisplayText(labelText = "From CGK", informationText = "Bengaluru")
    }
}