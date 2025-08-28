package com.cutcoach.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    CenteredMessage("CutCoach App Ready")
                }
            }
        }
    }
}

@Composable
fun CenteredMessage(text: String) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = text, modifier = Modifier.align(Alignment.Center).padding(24.dp))
    }
}
