package com.tck.musicplayer.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Home : Screen("home_screen")
    object Song : Screen("song_screen/{songId}") {
        fun passId(songId: Int): String {
            return "song_screen/$songId"
        }
    }
}