package com.example.googlegmailclone.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlegmailclone.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar() {
    Box(modifier = Modifier.padding(10.dp)) {
        Card(
            elevation = CardDefaults.cardElevation(6.dp),
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.Menu, "menu")
                TextField(
                    value = "Search Emails",
                    modifier = Modifier
                        .weight(2.0f),
                    onValueChange = {
                    })
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "profile",
                    modifier = Modifier
                        .background(Color.Gray, CircleShape)
                        .size(30.dp)
                        .clip(CircleShape)
                )
            }
        }

    }
}

@Preview
@Composable
fun HomeAppBarPreview() {
    HomeAppBar()
}