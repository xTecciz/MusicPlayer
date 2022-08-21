package com.tck.musicplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tck.musicplayer.navigation.SetupNavGraph
import com.tck.musicplayer.ui.theme.MusicPlayerTheme

class MainActivity : ComponentActivity() {

    private lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicPlayerTheme {
                navHostController = rememberNavController()
                SetupNavGraph(navHostController = navHostController)
            }
        }
    }
}
