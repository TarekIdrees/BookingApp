package com.bookingapp.tareq.ui.home_screen.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.home_screen.HomeUiState

@Composable
fun TravelerInformationRow(
    modifier: Modifier = Modifier,
    state: HomeUiState,
    onClickProfile: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            modifier = Modifier
                .size(66.dp)
                .clip(CircleShape)
                .clickable { onClickProfile() },
            painter = painterResource(id = state.travelerPhoto),
            contentDescription = "traveler photo",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.align(Alignment.CenterVertically)
        ) {
            Text(
                modifier = Modifier.clickable { onClickProfile() },
                text = state.travelerName,
                style = MaterialTheme.typography.displaySmall.copy(color = Color.White)
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "${state.travelerRank} Traveler",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview
@Composable
fun TravelerInformationRowPreview() {
    TravelerInformationRow(
        state = HomeUiState(
            travelerPhoto = R.drawable.tarek_1,
            travelerName = "Tareq Idris",
            travelerRank = "Premium"
        ),
        onClickProfile = {}
    )
}