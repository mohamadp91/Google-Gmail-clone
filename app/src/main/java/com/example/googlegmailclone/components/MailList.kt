package com.example.googlegmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlegmailclone.models.MailData

@Composable
fun MailList(
    scrollState: ScrollState,
    paddingValues: PaddingValues
) {
    val itemsList = listOf(
        MailData(
            1,
            "Mohamad",
            "Aim ever Upward",
            "training programming",
            "22:00"
        ),
        MailData(
            2,
            "Ali",
            "Take a break",
            "Take a rest and prepare yourself",
            "23:00"
        )
    )

    Box(modifier = Modifier.padding(paddingValues)) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .scrollable(scrollState, Orientation.Vertical)
        ) {
            items(itemsList) { item ->
                MailItem(mailData = item)
            }
        }
    }
}

@Composable
fun MailItem(modifier: Modifier = Modifier, mailData: MailData) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
    ) {
        Card(
            modifier = modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .clip(CircleShape),
            backgroundColor = Color.Gray
        ) {
            Text(
                text = mailData.username[0].toString(),
                modifier = modifier
                    .size(30.dp)
                    .padding(8.dp),
                textAlign = TextAlign.Center
            )
        }
        Column(
            modifier = modifier
                .weight(2.0f)
                .padding(start = 10.dp)
        ) {
            Text(
                text = mailData.username,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = mailData.subject,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = mailData.body,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Column {
            Text(
                text = mailData.timestamp,
            )
            IconButton(modifier =
            Modifier
                .padding(top = 18.dp)
                .size(50.dp),
                onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Star,
                    contentDescription = ""
                )
            }
        }
    }
}