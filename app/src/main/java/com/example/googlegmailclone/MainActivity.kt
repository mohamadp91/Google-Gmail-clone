package com.example.googlegmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.googlegmailclone.components.HomeAppBar
import com.example.googlegmailclone.ui.theme.GoogleGmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleGmailCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GmailApp() {
    Scaffold(topBar = { HomeAppBar() }) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GoogleGmailCloneTheme {
        GmailApp()
    }
}