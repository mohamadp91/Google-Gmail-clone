package com.example.googlegmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.googlegmailclone.R

@Composable
fun AccountDialog(shouldOpenDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = {
        shouldOpenDialog.value = false
    }) {
        DialogUi(shouldOpenDialog = shouldOpenDialog)
    }
}


@Composable
fun DialogUi(
    modifier: Modifier = Modifier,
    shouldOpenDialog: MutableState<Boolean>
) {
    Card(elevation = 6.dp) {
        Column(modifier.padding(bottom = 16.dp)) {
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {
                    shouldOpenDialog.value = false
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = ""
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    Modifier
                        .weight(2.0f)
                        .size(70.dp)
                )
            }
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, bottom = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "profile",
                    modifier = Modifier
                        .background(Color.Gray, CircleShape)
                        .size(35.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp)
                ) {
                    Text(text = "mohamadp91", fontWeight = FontWeight.SemiBold)
                    Text(text = "mohamadp91@gmail.com", color = Color.DarkGray)
                }
                Text(text = "+99", modifier.padding(end = 16.dp))
            }
            Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Card(
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                )
                {
                    Text(
                        text = "Manage Your Google Account",
                        modifier.padding(6.dp)
                    )
                }
            }
            Divider(
                modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 16.dp)
            )
        }
    }
}
