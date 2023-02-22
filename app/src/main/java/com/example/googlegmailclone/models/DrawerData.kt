package com.example.googlegmailclone.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerData(
    val text: String? = null,
    val icon: ImageVector? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {
    object AllInbox : DrawerData(text = "All Inbox", icon = Icons.Outlined.AllInbox)
    object Primary : DrawerData(text = "Primary", icon = Icons.Outlined.Inbox)
    object Promotions : DrawerData(text = "Promotions", icon = Icons.Outlined.Tag)
    object Social : DrawerData(text = "Social", icon = Icons.Outlined.Person)
    object Starred : DrawerData(text = "Starred", icon = Icons.Outlined.StarOutline)
    object Snoozed : DrawerData(text = "Snoozed", icon = Icons.Outlined.Snooze)
    object Important : DrawerData(text = "Important", icon = Icons.Outlined.Label)
    object Sent : DrawerData(text = "Sent", icon = Icons.Outlined.Send)
    object Schedule : DrawerData(text = "Schedule", icon = Icons.Outlined.Schedule)
    object Outbox : DrawerData(text = "Outbox", icon = Icons.Outlined.Outbox)
    object Draft : DrawerData(text = "Draft", icon = Icons.Outlined.Drafts)
    object AllMail : DrawerData(text = "All Mail", icon = Icons.Outlined.Mail)
    object Calendar : DrawerData(text = "Calendar", icon = Icons.Outlined.CalendarToday)
    object Contacts : DrawerData(text = "Contacts", icon = Icons.Outlined.Contacts)
    object Settings : DrawerData(text = "Settings", icon = Icons.Outlined.Settings)
    object Help : DrawerData(text = "Help", icon = Icons.Outlined.Help)
    object Divider : DrawerData(isDivider = true)
    object AllLabels : DrawerData(text = "All Labels", isHeader = true)
    object GoogleApps : DrawerData(text = "Google Apps", isHeader = true)
}
