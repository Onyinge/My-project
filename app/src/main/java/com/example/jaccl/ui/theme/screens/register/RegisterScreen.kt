package com.example.jaccl.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jaccl.R
import com.example.jaccl.data.AuthViewModel
import com.example.jaccl.navigation.ROUTE_ABOUT
import com.example.jaccl.navigation.ROUTE_LOGIN
import com.example.jaccl.navigation.ROUTE_ADD_PRODUCT



@Composable
fun RegisterScreen(navController: NavHostController){

    Box (){

        Image(painter = painterResource(id = R.drawable.cere2),
            contentDescription = "cereals",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var pass by remember { mutableStateOf(TextFieldValue("")) }
        var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current


        Column(
            modifier = Modifier,
//                .fillMaxSize()
//                .background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            Text(text = "WELCOME TO SOKO ",
                color = Color.Green,
                fontFamily = FontFamily.Serif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "CEREALS LIMITED" ,
                color = Color.Green,
                fontFamily = FontFamily.Serif,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "my profile", tint = Color.Green)


            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Register Now",
                color = Color.Green,
                fontFamily = FontFamily.Serif,
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold
            )


            OutlinedTextField(
                value = email, onValueChange = { email = it },
                label = { Text(text = "Enter your Email",
                    fontSize = 20.sp,
                    color = Color.Green,
                    fontWeight = FontWeight.SemiBold
                ) },

                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),

                )
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = pass, onValueChange = { pass = it },
                label = { Text(text = "Enter your Password",
                    fontSize = 20.sp,
                    color = Color.Green
                ) },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = confirmpass, onValueChange = {
                    confirmpass = it
                },
                label = { Text(text = "Confirm your Password",
                    fontSize = 20.sp,
                    color = Color.Green
                ) },

                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))


            Button(onClick = {
                val myregister=  AuthViewModel(navController,context)
                myregister.signup(email.text.trim(),pass.text.trim(), confirmpass.text.trim())
                navController.navigate(ROUTE_ABOUT)


            }, modifier = Modifier.fillMaxWidth(),


                colors = ButtonDefaults.buttonColors(Color.Green)) {
                Text(text = "Register ",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(300),
                modifier = Modifier)
            }
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(ROUTE_LOGIN)
            }, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Green)) {
                Text(text = "Have an Account? Click to Login",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(300),
                    modifier = Modifier )
            }

        }

    }



}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())
}
