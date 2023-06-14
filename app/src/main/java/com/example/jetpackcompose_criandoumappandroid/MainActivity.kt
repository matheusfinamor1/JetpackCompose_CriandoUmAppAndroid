package com.example.jetpackcompose_criandoumappandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose_criandoumappandroid.ui.theme.JetpackCompose_CriandoUmAppAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_CriandoUmAppAndroidTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Column {
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Imagem do produto"
        )
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}
