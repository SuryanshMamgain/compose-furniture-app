package com.example.jetfurniture.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetfurniture.screens.CheckOutScreen
import com.example.jetfurniture.screens.HomeScreen
import com.example.jetfurniture.screens.ProductScreen

@Composable
fun FurnitureNavigation(){
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Home){
        composable(Home){
            HomeScreen(navHostController)
        }
        composable(ProductDetail){
            ProductScreen(navHostController)
        }
        composable(Checkout){
            CheckOutScreen(navHostController)
        }
    }
}

const val Home="home_screen"
const val ProductDetail="product_detail_screen"
const val Checkout="check_out_screen"