package com.bookingapp.tareq.ui.flight_screen

import androidx.lifecycle.ViewModel
import com.bookingapp.tareq.data.FakeData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class FlightViewModel @Inject constructor() : ViewModel() {

    private var _state = MutableStateFlow(FlightScreenUiState())
    val state = _state.asStateFlow()

    init {
        getFlightInformation()
    }

    private fun getFlightInformation() {
        _state.update {
            it.copy(
                startFlight = FlightUiState(
                    countryShortcut = FakeData.flight.startCountryShortcut,
                    country = FakeData.flight.startCountry,
                    countryTime = FakeData.flight.startTime
                ),
                destinationFlight = FlightUiState(
                    countryShortcut = FakeData.flight.destinationCountryShortcut,
                    country = FakeData.flight.destinationCountry,
                    countryTime = FakeData.flight.arrivingTime
                ),
                startDate = FakeData.flight.departDate,
                endDate = FakeData.flight.arriveDate,
                flightClass = FakeData.flight.flightClass,
                offersImage = FakeData.offersImage
            )
        }
    }
}