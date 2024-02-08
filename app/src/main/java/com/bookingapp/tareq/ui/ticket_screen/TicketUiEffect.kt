package com.bookingapp.tareq.ui.ticket_screen

import com.bookingapp.tareq.ui.base.BaseUiEffect

sealed class TicketUiEffect : BaseUiEffect {
    object BackButtonEffect : TicketUiEffect()
}