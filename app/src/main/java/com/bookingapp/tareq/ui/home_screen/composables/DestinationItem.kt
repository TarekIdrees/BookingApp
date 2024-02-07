package com.bookingapp.tareq.ui.home_screen.composables


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R

@Composable
fun DestinationItem(
    modifier: Modifier = Modifier,
    destinationPhoto: Painter,
    destinationName: String
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(width = 126.dp, height = 170.dp)
                .clip(RoundedCornerShape(18.dp)),
            painter = destinationPhoto,
            contentDescription = "destination photo",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = destinationName,
            style = MaterialTheme.typography.headlineSmall.copy(Color.White)
        )
    }
}

@Preview
@Composable
private fun DestinationItemPreview() {
    DestinationItem(
        destinationPhoto = painterResource(id = R.drawable.photo_one),
        destinationName = "Maldive"
    )
}