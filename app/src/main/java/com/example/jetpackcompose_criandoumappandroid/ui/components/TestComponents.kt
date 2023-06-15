package com.example.jetpackcompose_criandoumappandroid.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose_criandoumappandroid.R
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
/*
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
**/

/*
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
**/

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


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImplementarTelaComScrollUtilizandoColumn() {
    Column(
        modifier = Modifier
            .height(400.dp)
            .width(200.dp)
    ) {
        Text(text = "Promoções")
        ScrollItem()
    }
}

@Preview(showBackground = true)
@Composable
fun ScrollItem(description: String = "") {
    Surface(
        tonalElevation = 4.dp,
        shape = RoundedCornerShape(15.dp)
    ) {
        Column(
            modifier = Modifier
                .heightIn(min = 250.dp, max = 260.dp)
                .width(200.dp)
                .verticalScroll(rememberScrollState())
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500,
                                Teal200
                            )
                        )
                    )
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .height(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(BottomCenter)
                )
            }
            Spacer(
                modifier = Modifier
                    .height(imageSize/2)
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    maxLines = 2,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "R$ 14,99",
                    modifier = Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                    )
                if (description.isNotBlank()){
                    Text(
                        text = description,
                        modifier = Modifier
                            .background(MaterialTheme.colorScheme.primary)
                            .padding(
                                start = 16.dp,
                                end = 16.dp,
                                bottom = 16.dp,
                                top = 8.dp
                            ),
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ComposableDescriptionPreview() {
    ScrollItem(LoremIpsum(50).values.first())
}

