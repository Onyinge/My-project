package com.example.jaccl.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.R
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
import com.example.jaccl.data.AuthViewModel
import com.example.jaccl.navigation.ROUTE_REGISTER



@Composable
fun LoginScreen(navController: NavHostController) {

    Box {
        Image(painter = painterResource(id = com.example.jaccl.R.drawable.cere2),
            contentDescription = "cere",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())

        var email by remember { mutableStateOf(TextFieldValue("")) }


        var pass by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current
        Column(
            modifier = Modifier,
//        .fillMaxSize()
//        .background(Color.Blue)
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login here",
                color = Color.Green,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp
            )
            Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "my profile", tint = Color.Green)

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = email, onValueChange = { email = it },
                label = { Text(text = "Enter Email",
                    fontSize = 20.sp,
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(300),
                    modifier = Modifier ) },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            )
            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(
                value = pass, onValueChange = { pass = it },
                label = { Text(text = "Enter Password",
                    fontSize = 20.sp,
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(300),
                    modifier = Modifier ) },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                val mylogin = AuthViewModel(navController, context)
                mylogin.login(email.text.trim(), pass.text.trim())

            }, modifier = Modifier.fillMaxWidth()
                ) {
                Text(text = "Log In",
                    fontSize = 20.sp,
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(300),
                    modifier = Modifier)
            }
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(ROUTE_REGISTER)
            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Don't have account? Click to Register",
                    fontSize = 20.sp,
                    color = Color.Green,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(300),
                    modifier = Modifier )
            }

        }
    }

}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Loginpage() {
    LoginScreen(rememberNavController())
}
