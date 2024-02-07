package com.bookingapp.tareq.ui.presentation.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.presentation.common_composables.BookingTopAppbar
import com.bookingapp.tareq.ui.presentation.common_composables.RowHeadline
import com.bookingapp.tareq.ui.presentation.home_screen.composables.DestinationItem
import com.bookingapp.tareq.ui.presentation.home_screen.composables.TravelerInformationRow
import com.bookingapp.tareq.ui.presentation.home_screen.composables.TripBox
import com.bookingapp.tareq.ui.theme.BookingAppTheme

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    HomeContent(state)
}

@Composable
private fun HomeContent(state: HomeUiState) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentPadding = PaddingValues(top = 8.dp, bottom = 8.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_left_arrow),
                        contentDescription = "back arrow",
                        tint = Color.White
                    )
                }
                BookingTopAppbar()
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            TravelerInformationRow(modifier = Modifier.padding(horizontal = 16.dp), state = state)
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            TripBox(modifier = Modifier.padding(horizontal = 16.dp))
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            RowHeadline(modifier = Modifier.padding(horizontal = 16.dp), headline = "Destination")
        }
        item {
            Spacer(modifier = Modifier.height(22.dp))
        }
        item {
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                state.destinationPlaces.forEach {
                    item {
                        DestinationItem(
                            destinationName = it.destinationName,
                            destinationPhoto = painterResource(id = it.destinationPhoto)
                        )
                    }
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
            RowHeadline(
                modifier = Modifier.padding(horizontal = 16.dp),
                headline = "Holiday Packages"
            )
        }
        item {
            Spacer(modifier = Modifier.height(22.dp))
        }
        items(state.holidayImages) { image ->
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, start = 16.dp, end = 16.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(id = image),
                contentDescription = "holiday photo",
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    BookingAppTheme {
        HomeScreen()
    }
}