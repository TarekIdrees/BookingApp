package com.bookingapp.tareq.ui.flight_screen

import com.bookingapp.tareq.data.FakeData
import com.bookingapp.tareq.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class FlightViewModel @Inject constructor() : BaseViewModel<FlightScreenUiState, FlightUiEffect>(
    FlightScreenUiState()
), FlightInteractionListener {

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

    override fun onClickOneWayButton() {
        effectActionExecutor(_effect, FlightUiEffect.NavigationToTicketEffect)
    }

    override fun onClickRoundTripButton() {
        effectActionExecutor(_effect, FlightUiEffect.NavigationToTicketEffect)
    }

    override fun onClickSearchFlightButton() {
        effectActionExecutor(_effect, FlightUiEffect.showInCompleteScreenToast)
    }

    override fun onClickOfferCard() {
        effectActionExecutor(_effect, FlightUiEffect.showInCompleteScreenToast)
    }

    override fun onClickOffersSeeAll() {
        effectActionExecutor(_effect, FlightUiEffect.showInCompleteScreenToast)
    }
}