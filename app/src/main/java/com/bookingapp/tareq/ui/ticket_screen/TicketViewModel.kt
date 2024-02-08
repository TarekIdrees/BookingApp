package com.bookingapp.tareq.ui.ticket_screen


import com.bookingapp.tareq.data.FakeData
import com.bookingapp.tareq.ui.base.BaseViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class TicketViewModel @Inject constructor() : BaseViewModel<TicketUiState, TicketUiEffect>(
    TicketUiState()
), TicketInteractionListener {

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

    override fun onClickBackButton() {
        effectActionExecutor(_effect, TicketUiEffect.BackButtonEffect)
    }
}