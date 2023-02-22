package com.example.googlegmailclone.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarData(val icon: ImageVector, val text: String) {
    object Mail : BottomBarData(Icons.Outlined.Mail, "Mail")
    object Meet : BottomBarData(Icons.Outlined.VideoCall, "Meet")
}
