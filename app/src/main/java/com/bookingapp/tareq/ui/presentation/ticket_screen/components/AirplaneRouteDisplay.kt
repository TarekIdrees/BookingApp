package com.bookingapp.tareq.ui.presentation.ticket_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R

@Composable
fun AirplaneRouteDisplay(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = R.drawable.ic_plane),
            contentDescription = "plane icon",
            tint = Color.White
        )
        Spacer(modifier = modifier.padding(6.dp))
        Divider(color = Color.White, modifier = Modifier
            .weight(0.25f)
            .width(2.dp))
        Spacer(modifier = modifier.padding(6.dp))
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = R.drawable.ic_swap_arrawos),
            contentDescription = "direction icon",
            tint = Color.White
        )
        Spacer(modifier = modifier.padding(6.dp))
        Divider(color = Color.White, modifier = Modifier
            .weight(0.25f)
            .width(2.dp))
    }
}

@Preview
@Composable
fun AirplaneRouteDisplayPreview() {
    AirplaneRouteDisplay()
}