package com.example.jetpackcompose_criandoumappandroid.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_criandoumappandroid.R
import com.example.jetpackcompose_criandoumappandroid.ui.theme.Purple40
import com.example.jetpackcompose_criandoumappandroid.ui.theme.Purple500
import com.example.jetpackcompose_criandoumappandroid.ui.theme.Teal200

/*
@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto!")
    Text(text = "Meu primeiro texto maior!")
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto1")
        Text(text = "Texto2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto1")
        Text(text = "Texto2")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 16.dp
                )
                .background(color = Color.Green)
                .fillMaxWidth()
        ) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            modifier = Modifier
                .padding(8.dp)
                .background(color = Color.Red)
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Color.Cyan)
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Color.Yellow)
                    .padding(8.dp)
            ) {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}
**/
@Preview(showBackground = true)
@Composable
fun DesafioImplDesignPreview() {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()
            .height(120.dp)
    ) {

        Row {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(80.dp)
                    .background(color = Color.Blue)
            )
            Column(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(text = "Test 1")
                Text(text = "Test 2")
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DesignComTecnicasSimilares() {
    Surface(
        modifier = Modifier
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        tonalElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .width(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Purple500,
                                Teal200
                            )
                        )
                    )
                    .fillMaxHeight()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .size(imageSize)
                        .align(CenterStart)
                        .offset(x = imageSize / 2)
                        .clip(shape = CircleShape)
                        .border(
                            BorderStroke(
                                2.dp, brush = Brush.verticalGradient(
                                    listOf(
                                        Purple500, Purple40
                                    )
                                )
                            ), CircleShape
                        )


                )
            }
            Spacer(
                modifier = Modifier
                    .width(imageSize/2)
            )
            Box(
                modifier = Modifier
                    .padding(32.dp)
                    .fillMaxHeight()
                    .align(CenterVertically)
            ) {
                Column {
                    Text(
                        text = LoremIpsum(50).values.first(),
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 20.sp
                    )
                }
            }
        }

    }
}

/*
@Preview(showBackground = true)
@Composable
fun MyFirstComposablePreview() {
    JetpackCompose_CriandoUmAppAndroidTheme {
        Surface {
            DesignComTecnicasSimilares()
        }
    }
}
**/
