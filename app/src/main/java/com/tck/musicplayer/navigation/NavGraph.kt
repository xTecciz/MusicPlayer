package com.tck.musicplayer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route){
            SplashScreen(navHostController = navHostController)
        }

        composable(route = Screen.ScreenOne.route) {

        }

        composable(route = Screen.ScreenTwo.route) {

        }
    }
}