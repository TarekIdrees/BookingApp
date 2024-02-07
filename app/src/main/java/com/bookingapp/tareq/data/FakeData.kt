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
        photo = R.drawable.tarek_1,
        rank = "Premium"
    )

    val destinationPlaces = listOf(
        Destination(
            "Maldive",
            R.drawable.photo_one
        ),
        Destination(
            "Paris",
            R.drawable.photo_two
        ),
        Destination(
            "Malissia",
            R.drawable.photo_three
        ),
        Destination(
            "Istanbul",
            R.drawable.photo_four
        )
    )

    val holidayImages = listOf(
        R.drawable.guinea,
        R.drawable.burkina_faso,
        R.drawable.kiribat_unesco,
        R.drawable.sierra_leone,
        R.drawable.mautitus
    )
}