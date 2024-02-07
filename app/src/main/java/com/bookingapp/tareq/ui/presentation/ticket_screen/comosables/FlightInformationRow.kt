package com.bookingapp.tareq.ui.presentation.ticket_screen.comosables

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import com.bookingapp.tareq.ui.theme.Brand

@Composable
fun FlightInformationRow(
    locationShortcut: String,
    destinationShortcut: String,
    estimatedFlightTime: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = locationShortcut, style = MaterialTheme.typography.bodyLarge)
        Box() {
            val infiniteTransition = rememberInfiniteTransition(label = "")

            val rotation by infiniteTransition.animateFloat(
                initialValue = 0f,
                targetValue = 360f,
                animationSpec = infiniteRepeatable(
                    animation = tween(
                        durationMillis = 3000,
                        easing = FastOutLinearInEasing,
                    ),
                ), label = ""
            )
            Canvas(
                modifier = Modifier
                    .size(size = 20.dp)
                    .align(Alignment.Center)
            ) {
                rotate(rotation) {
                    drawCircle(
                        brush = Brush.verticalGradient(colors = listOf(Brand, Color.Transparent)),
                        radius = 45.dp.toPx(),
                        style = Stroke(width = 1.dp.toPx())
                    )
                }
            }
            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    modifier = Modifier.size(28.dp).rotate(40f),
                    painter = painterResource(id = R.drawable.ic_plane),
                    contentDescription = "plane icon",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = estimatedFlightTime,
                    style = MaterialTheme.typography.bodySmall.copy(Color.White)
                )
            }
        }
        Text(text = destinationShortcut, style = MaterialTheme.typography.bodyLarge)
    }
}

@Preview
@Composable
fun FlightInformationRowPreview() {
    BookingAppTheme {
        FlightInformationRow(
            locationShortcut = "BLR",
            destinationShortcut = "BKK",
            estimatedFlightTime = "3h 20m"
        )
    }
}