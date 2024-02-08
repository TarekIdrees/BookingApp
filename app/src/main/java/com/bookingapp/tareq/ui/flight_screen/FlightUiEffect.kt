package com.bookingapp.tareq.ui.flight_screen

import com.bookingapp.tareq.ui.base.BaseUiEffect


sealed class FlightUiEffect: BaseUiEffect {
    object NavigationToTicketEffect: FlightUiEffect()
    object showInCompleteScreenToast : FlightUiEffect()
}