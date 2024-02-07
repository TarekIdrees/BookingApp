package com.bookingapp.tareq.ui.presentation.home_screen

import com.bookingapp.tareq.data.Destination

data class HomeUiState(
    val travelerName: String = "",
    val travelerPhoto: Int = 0,
    val travelerRank: String = "",
    val destinationPlaces: List<DestinationPlace> = emptyList(),
    val holidayImages: List<Int> = emptyList()
)

data class DestinationPlace(
    val destinationName: String = "",
    val destinationPhoto: Int = 0
)

fun Destination.toDestinationUiState(): DestinationPlace {
    return DestinationPlace(
        destinationName = destinationName,
        destinationPhoto = destiantionPhoto
    )
}