package com.example.jaccl.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jaccl.R

@Composable
fun BuyProductsScreen(navController: NavController) {
    Column {
        Box {

            Image(
                painter = painterResource(id = R.drawable.cere6),
                contentDescription = "cereals",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .matchParentSize()
                    .height(180.dp)
            )
            Text(
                text = "THIS IS WHERE YOU BUY THE CEREALS OF YOUR CHOICE.",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight(300),
                modifier = Modifier
            )
        Column() {
            Card {
                Text(text = "Maize")
                Image(


                    painter = painterResource(id = R.drawable.cere7),
                    contentDescription = "maize",
                    modifier = Modifier
                        .height(90.dp)
                        .height(60.dp)
                )
            }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BuyProductScreenPreview(){
    BuyProductsScreen(rememberNavController())
}

