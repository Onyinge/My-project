package com.example.jaccl.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jaccl.ui.theme.screens.about.AboutScreen
import com.example.jaccl.ui.theme.screens.home.HomeScreen
import com.example.jaccl.ui.theme.screens.login.LoginScreen
import com.example.jaccl.ui.theme.screens.products.AddProductsScreen
import com.example.jaccl.ui.theme.screens.register.RegisterScreen
import com.example.jaccl.ui.theme.screens.products.BuyProductsScreen
import com.example.jaccl.ui.theme.screens.products.UpdateProductsScreen
import com.example.jaccl.ui.theme.screens.products.ViewProductsScreen
import com.example.jaccl.ui.theme.screens.products.ViewUploadsScreen


@Composable
fun AppNavHost (
    navController: NavHostController= rememberNavController(),
    startDestination: String= ROUTE_REGISTER) {

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_LOGIN)
        {
            LoginScreen(navController)
        }

        composable(ROUTE_BUY_PRODUCT){
            BuyProductsScreen(navController)

        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT){
            UpdateProductsScreen(navController, id = "")
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)

        }
    }


}