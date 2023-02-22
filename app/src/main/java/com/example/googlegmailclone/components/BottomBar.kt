package com.example.googlegmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.googlegmailclone.models.BottomBarData

@Composable
fun BottomBar() {
    val menuList = listOf(
        BottomBarData.Mail,
        BottomBarData.Meet
    )

    BottomNavigation(
        backgroundColor = Color.LightGray,
        contentColor = Color.LightGray,
    ) {
        menuList.forEach { item ->
            BottomNavigationItem(selected = false,
                onClick = {},
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "icon"
                    )
                },
                alwaysShowLabel = true,
                label = {
                    Text(text = item.text)
                }
            )
        }
    }
}