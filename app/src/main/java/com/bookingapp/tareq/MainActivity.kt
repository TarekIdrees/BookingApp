package com.bookingapp.tareq


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.bookingapp.tareq.ui.navigation.LocalNavigationProvider
import com.bookingapp.tareq.ui.navigation.MainNavGraph
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            CompositionLocalProvider(LocalNavigationProvider provides rememberNavController()) {
                BookingAppTheme {
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        content = { innerPadding ->
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(MaterialTheme.colorScheme.background)
                                    .padding(innerPadding),
                                contentAlignment = Alignment.Center
                            ) {
                                MainNavGraph()
                            }
                        },
                        contentWindowInsets = WindowInsets(0, 0, 0, 0)
                    )
                }

            }
        }
    }
}

