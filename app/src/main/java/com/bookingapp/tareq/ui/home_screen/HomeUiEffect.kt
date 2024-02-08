package com.bookingapp.tareq.ui.home_screen

import com.bookingapp.tareq.ui.base.BaseUiEffect

sealed class HomeUiEffect : BaseUiEffect{
    object NavigationToFlightEffect : HomeUiEffect()
    object ShowInCompleteScreenToastEffect : HomeUiEffect()

    object BackButtonEffect: HomeUiEffect()
}