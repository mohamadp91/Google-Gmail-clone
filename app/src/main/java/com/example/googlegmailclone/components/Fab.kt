package com.example.googlegmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Fab(scrollState: ScrollState) {
    val EditIcon = Icons.Outlined.Edit

    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(text = { Text(text = "Compose") },
            icon = {
                Icon(
                    imageVector = EditIcon,
                    contentDescription = ""
                )
            },
            backgroundColor = MaterialTheme.colors.surface, onClick = {})
    } else
        FloatingActionButton(
            onClick = {},
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(
                imageVector = EditIcon,
                contentDescription = ""
            )
        }
}