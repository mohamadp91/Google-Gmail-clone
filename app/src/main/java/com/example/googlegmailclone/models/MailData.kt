package com.example.googlegmailclone.models

data class MailData(
    val id: Int,
    val username: String,
    val subject: String,
    val body: String,
    val timestamp: String
) {
}