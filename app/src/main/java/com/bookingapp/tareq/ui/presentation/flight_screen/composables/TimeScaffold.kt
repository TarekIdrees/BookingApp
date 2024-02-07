package com.bookingapp.tareq.ui.presentation.flight_screen.composables


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.theme.BookingAppTheme

@Composable
fun TimeScaffold(
    modifier: Modifier = Modifier,
    icon: Painter = painterResource(id = R.drawable.ic_clock),
    time: String,
    locationShortcut: String,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = time,
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            text = "($locationShortcut)",
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Icon(
            modifier = Modifier.size(32.dp),
            painter = icon, contentDescription = "time icon",
            tint = Color.White
        )
    }
}

@Preview
@Composable
private fun TimeScaffoldPreview() {
    BookingAppTheme {
        TimeScaffold(time = "23:21", locationShortcut = "BLR")
    }
}