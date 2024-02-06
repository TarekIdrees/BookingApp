package com.bookingapp.tareq.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookingapp.tareq.R
import com.bookingapp.tareq.ui.theme.BookingAppTheme

@Composable
fun BookingTopAppbar(
    modifier: Modifier = Modifier,
    searchAction: () -> Unit = {},
    notificationAction: () -> Unit = {},
    filterAction: () -> Unit = {},
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp,Alignment.End)
    ) {
        IconButton(
            onClick = searchAction,
        ) {
            Icon(
                modifier = Modifier.size(28.dp),
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "search icon",
                tint = Color.White
            )
        }
        IconButton(onClick = notificationAction) {
            Icon(
                modifier = Modifier.size(28.dp),
                painter = painterResource(id = R.drawable.ic_notification),
                contentDescription = "notification icon",
                tint = Color.White
            )
        }
        IconButton(onClick = filterAction) {
            Icon(
                modifier = Modifier.size(28.dp),
                painter = painterResource(id = R.drawable.ic_filter),
                contentDescription = "filter icon",
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
private fun BookingTopAppBarPreview() {
    BookingAppTheme {
        BookingTopAppbar()
    }
}