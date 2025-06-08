package com.example.cryptomonitor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cryptomonitor.ui.theme.CryptoMonitorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoMonitorTheme {
                CryptoScreen()
            }
        }
    }
}
