package com.bookingapp.tareq

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import com.bookingapp.tareq.ui.navigation.LocalNavigationProvider
import com.bookingapp.tareq.ui.navigation.MainNavGraph
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(LocalNavigationProvider provides rememberNavController()) {
                BookingAppTheme {
                    MainNavGraph()
                }
            }
        }
    }
}

