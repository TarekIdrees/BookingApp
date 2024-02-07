package com.bookingapp.tareq.ui.presentation.home_screen

import androidx.lifecycle.ViewModel
import com.bookingapp.tareq.data.FakeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class HomeViewModel @Inject constructor() : ViewModel() {

    private var _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getTravelerInformation()
    }

    private fun getTravelerInformation() {
        _state.update {
            it.copy(
                travelerName = FakeData.travelerInformation.name,
                travelerPhoto = FakeData.travelerInformation.photo,
                travelerRank = FakeData.travelerInformation.rank,
                destinationPlaces = FakeData.destinationPlaces.map { it.toDestinationUiState() },
                holidayImages = FakeData.holidayImages
            )
        }
    }
}