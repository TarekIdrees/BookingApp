package com.bookingapp.tareq.ui.presentation.home_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.presentation.common_composables.RoundedTicketButton
import com.bookingapp.tareq.ui.theme.Brand

@Composable
fun TripBox(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(width = 398.dp, height = 262.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Brand)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            painter = painterResource(id = R.drawable.art2),
            contentDescription = "art",
            contentScale = ContentScale.FillBounds
        )
        Image(
            modifier = Modifier
                .size(400.dp)
                .align(Alignment.BottomStart)
                .padding(start = 16.dp),
            painter = painterResource(id = R.drawable.traveler_photo),
            contentDescription = "traveler photo",
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .align(Alignment.CenterEnd),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                modifier = Modifier.padding(start = 200.dp, end = 4.dp),
                text = "Let's Make Our Life so a Life",
                style = MaterialTheme.typography.headlineLarge,
            )
            Spacer(modifier = Modifier.height(8.dp))
            RoundedTicketButton(
                modifier = Modifier.padding(end = 16.dp),
                text = "Find Trip",
                textColor = Brand,
                background = Color.Black
            )
        }

    }
}