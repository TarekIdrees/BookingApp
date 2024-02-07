package com.bookingapp.tareq.data

import com.bookingapp.tareq.R

object FakeData {
    val flight = Flight(
        startCountry = "Bengaluru",
        startCountryShortcut = "BLR",
        startTime = "23:21",
        destinationCountry = "Bangkok",
        destinationCountryShortcut = "BKK",
        arrivingTime = "04:45",
        departDate = "Sun, Jul 23",
        arriveDate = "Mon, Jul 24",
        flightNumber = "TG-326",
        flightClass = "Business",
        estimatedFlightTime = "3h 20m",
        gate = "B7",
        seat = "21A"
    )

    val offersImage = listOf(
        R.drawable.photo_one,
        R.drawable.photo_two,
        R.drawable.photo_three,
        R.drawable.photo_four,
    )

    val travelerInformation = Traveler(
        name = "Tareq Idris",
        photo = R.drawable.tareq_idris,
        rank = "Premium"
    )
}