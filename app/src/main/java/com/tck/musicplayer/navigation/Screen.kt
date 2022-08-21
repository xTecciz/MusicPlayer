package com.tck.musicplayer.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("SplashScreen")
    object ScreenOne : Screen("ScreenOne")
    object ScreenTwo : Screen("ScreenTwo")
}