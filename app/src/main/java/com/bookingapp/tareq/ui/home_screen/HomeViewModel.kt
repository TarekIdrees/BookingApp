package com.bookingapp.tareq.ui.home_screen

import com.bookingapp.tareq.data.FakeData
import com.bookingapp.tareq.ui.base.BaseViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class HomeViewModel @Inject constructor() : BaseViewModel<HomeUiState, HomeUiEffect>(HomeUiState()),
    HomeInteractionListener {

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

    override fun onClickFindTrip() {
        effectActionExecutor(_effect, HomeUiEffect.NavigationToFlightEffect)
    }

    override fun onClickProfile() {
        effectActionExecutor(_effect, HomeUiEffect.ShowInCompleteScreenToastEffect)
    }

    override fun onClickDestinationCard() {
        effectActionExecutor(_effect, HomeUiEffect.ShowInCompleteScreenToastEffect)
    }

    override fun onClickDestinationSeeAll() {
        effectActionExecutor(_effect, HomeUiEffect.ShowInCompleteScreenToastEffect)
    }

    override fun onClickHolidayCard() {
        effectActionExecutor(_effect, HomeUiEffect.ShowInCompleteScreenToastEffect)
    }

    override fun onClickHolidaySeeAll() {
        effectActionExecutor(_effect, HomeUiEffect.ShowInCompleteScreenToastEffect)
    }

    override fun onClickBackButton() {
        effectActionExecutor(_effect, HomeUiEffect.BackButtonEffect)
    }
}