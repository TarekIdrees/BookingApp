package com.bookingapp.tareq.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bookingapp.tareq.R

val RedHat = FontFamily(
    listOf(
        Font(R.font.red_hat_display_regular, FontWeight.Normal),
        Font(R.font.red_hat_display_bold, FontWeight.Bold),
        Font(R.font.red_hat_display_medium, FontWeight.Medium),
        Font(R.font.red_hat_display_semi_bold, FontWeight.SemiBold)
    )
)

val Typography = Typography(
    titleSmall = TextStyle(
        color = White,
        fontSize = 16.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.SemiBold
    ),
    labelSmall = TextStyle(
        color = White,
        fontSize = 14.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.Bold
    ),
    displayLarge = TextStyle(
        color = Brand,
        fontSize = 28.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.SemiBold
    ),
    displaySmall = TextStyle(
        color = White,
        fontSize = 16.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.Bold
    ),
    displayMedium = TextStyle(
        color = Brand,
        fontSize = 22.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.SemiBold
    ),
    headlineSmall = TextStyle(
        color = White,
        fontSize = 14.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.Normal
    ),
    headlineLarge = TextStyle(
        color = Color.Black,
        fontSize = 28.sp,
        fontFamily = RedHat,
        fontWeight = FontWeight.Bold
    )
)