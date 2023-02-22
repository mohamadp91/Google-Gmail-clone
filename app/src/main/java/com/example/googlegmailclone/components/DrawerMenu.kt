package com.example.googlegmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlegmailclone.models.DrawerData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {

    val menuList = listOf(
        DrawerData.Divider,
        DrawerData.AllInbox,
        DrawerData.Divider,
        DrawerData.Primary,
        DrawerData.Promotions,
        DrawerData.Social,
        DrawerData.AllLabels,
        DrawerData.Starred,
        DrawerData.Snoozed,
        DrawerData.Important,
        DrawerData.Sent,
        DrawerData.Schedule,
        DrawerData.Outbox,
        DrawerData.Draft,
        DrawerData.AllMail,
        DrawerData.GoogleApps,
        DrawerData.Calendar,
        DrawerData.Contacts,
        DrawerData.Divider,
        DrawerData.Settings,
        DrawerData.Help
    )

    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
    ) {
        Text(
            text = "Gmail",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(16.dp)
        )
        menuList.forEach { item ->
            when {
                item.isDivider -> {
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp, bottom = 20.dp),
                        color = Color.Gray
                    )
                }
                item.isHeader -> {
                    Text(
                        text = item.text!!, fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(
                            start = 20.dp,
                            top = 20.dp,
                            bottom = 20.dp
                        )
                    )
                }
                else -> {
                    MailDrawerItem(item = item)
                }
            }
        }
    }
}

@Composable
fun MailDrawerItem(item: DrawerData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = "icon",
            modifier = Modifier
                .padding(start = 20.dp)
                .weight(.5f)
        )
        Text(
            text = item.text!!,
            fontSize = 16.sp,
            modifier = Modifier
                .weight(2.0f)
                .padding(start = 6.dp)
        )
    }
}