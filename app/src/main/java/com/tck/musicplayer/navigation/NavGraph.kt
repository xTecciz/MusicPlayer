package com.tck.musicplayer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tck.musicplayer.presentation.screens.home.HomeScreen
import com.tck.musicplayer.presentation.screens.song.SongScreen
import com.tck.musicplayer.presentation.screens.splash.SplashScreen

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController = navHostController)
        }

        composable(route = Screen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }

        composable(route = Screen.Song.route) {
            val songId = 1
            SongScreen(songId = songId, navHostController = navHostController)
        }
    }
}