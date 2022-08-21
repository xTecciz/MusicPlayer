package com.tck.musicplayer.presentation.screens.splash

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import com.tck.musicplayer.navigation.Screen
import com.tck.musicplayer.util.Constants.SPLASH_SCREEN_DELAY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navHostController: NavHostController
) {
    LaunchedEffect(key1 = true) {

        delay(SPLASH_SCREEN_DELAY)
        navHostController.popBackStack()
        navHostController.navigate(Screen.Home.route)
    }

    Text(text = "SplashScreen")
}