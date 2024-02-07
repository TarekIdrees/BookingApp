package com.bookingapp.tareq

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bookingapp.tareq.ui.flight_screen.FlightScreen
import com.bookingapp.tareq.ui.home_screen.HomeScreen
import com.bookingapp.tareq.ui.ticket_screen.TicketScreen
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookingAppTheme {
                TicketScreen()
            }
        }
    }
}

