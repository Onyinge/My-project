package com.example.jaccl.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.jaccl.navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavController){
    Column (horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.cere4),
                    contentDescription = "cereals",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(180.dp)
                        .width(180.dp)
                )
            }

        Column (
            modifier = Modifier,
//                .fillMaxSize()
//                .background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .height(120.dp)
                    .fillMaxWidth()


            ) {
                Text(
                    modifier = Modifier
                        .background(color = Color.Green)
                        .height(120.dp)
                        .width(900.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically),
                    text = "WELCOME TO SOKO CEREALS.",
                    fontFamily = FontFamily.Serif,
                    fontSize = 20.sp


                )
                Text(
                    modifier = Modifier
                        .background(color = Color.Green)
                        .height(80.dp)
                        .width(900.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically),

                    text = " WHERE FARMERS MEET. THEIR NEEDS",
                    fontFamily = FontFamily.Serif,
                    fontSize = 20.sp

                )

                Text(
                    modifier = Modifier
                        .background(color = Color.Green)
                        .height(80.dp)
                        .width(900.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically),

                    text = "WELCOME TO SOKO CEREALS. WHERE FARMERS MEET THEIR NEEDS",
                    fontFamily = FontFamily.Serif,
                    fontSize = 20.sp,
                    fontWeight = FontWeight(300)

                )


            }

                Spacer(modifier = Modifier.height(30.dp))

            Text( modifier = Modifier
                .background(color = Color.Green)
                .height(80.dp)
                .width(900.dp)
                .wrapContentHeight(align = Alignment.CenterVertically),
                text = "This platform helps all wholesale farmers and cereal sellers to reach the wide market.",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )

            Spacer(modifier = Modifier.height(60.dp))
            }
            Button(
                onClick = { navController.navigate(ROUTE_HOME) },
                colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
                Text(
                    text = "GO TO HOME SCREEN",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif
                )
            }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}