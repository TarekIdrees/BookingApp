package com.bookingapp.tareq.ui.presentation.ticket_screen

import androidx.lifecycle.ViewModel
import com.bookingapp.tareq.data.FakeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class TicketViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(TicketUiState())
    val state = _state.asStateFlow()

    init {
        getFlightInformation()
    }

    private fun getFlightInformation() {
        _state.update {
            it.copy(
                locationShortcut = FakeData.flight.startCountryShortcut,
                destinationShortcut = FakeData.flight.destinationCountryShortcut,
                flightInformation = FakeData.flight.toFlightUiState()
            )
        }
    }
}