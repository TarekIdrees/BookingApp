package com.bookingapp.tareq.ui.common_composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.ui.theme.BookingAppTheme
import com.bookingapp.tareq.ui.theme.Brand
import com.bookingapp.tareq.ui.theme.Green

@Composable
fun RoundedTicketButton(
    modifier: Modifier = Modifier,
    textColor: Color = Color.Black,
    background: Color = Brand,
    isThereBorder: Boolean = false,
    borderColor: Color = Green,
    borderWidth: Dp = 1.dp,
    onClick: () -> Unit = {},
    text: String
) {
    if (isThereBorder) {
        OutlinedButton(
            modifier = modifier.width(182.dp).height(54.dp),
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(containerColor = background),
            border = BorderStroke(borderWidth, borderColor)
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.displaySmall.copy(color = textColor)
            )
        }
    } else {
        Button(
            modifier = modifier.width(182.dp).height(54.dp),
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(containerColor = background),
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.displaySmall.copy(color = textColor)
            )
        }
    }

}

@Preview
@Composable
private fun RoundedTicketButtonOutlinedPreview() {
    BookingAppTheme {
        RoundedTicketButton(text = "Round Trip", isThereBorder = true, background = Color.White)
    }
}

@Preview
@Composable
private fun RoundedTicketButtonPreview() {
    BookingAppTheme {
        RoundedTicketButton(text = "One Way")
    }
}