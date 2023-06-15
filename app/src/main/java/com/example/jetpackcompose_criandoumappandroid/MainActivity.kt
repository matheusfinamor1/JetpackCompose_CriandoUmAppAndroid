package com.example.jetpackcompose_criandoumappandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.jetpackcompose_criandoumappandroid.ui.screens.HomeScreen
import com.example.jetpackcompose_criandoumappandroid.ui.theme.JetpackCompose_CriandoUmAppAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    JetpackCompose_CriandoUmAppAndroidTheme {
        Surface {
            HomeScreen()
        }
    }
}