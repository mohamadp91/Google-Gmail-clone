package com.example.googlegmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.googlegmailclone.components.*
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

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val shouldOpenDialog = remember {
        mutableStateOf(false)
    }

    Scaffold(scaffoldState = scaffoldState,
        topBar = {
            HomeAppBar(
                scaffoldState,
                coroutineScope,
                shouldOpenDialog
            )
        },
        drawerContent = { GmailDrawerMenu(scrollState) },
        bottomBar = { BottomBar() },
        floatingActionButton = { Fab(scrollState = scrollState) }) {
        MailList(scrollState, paddingValues = it)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GoogleGmailCloneTheme {
        GmailApp()
    }
}