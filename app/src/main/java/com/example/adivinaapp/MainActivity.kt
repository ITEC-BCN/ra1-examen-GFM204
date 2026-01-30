package com.example.adivinaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.adivinaapp.ViewModel.GameViewModel
import com.example.adivinaapp.ui.theme.AdivinaAPPTheme
import com.example.adivinaapp.view.GameScreen
import com.example.adivinaapp.view.MenuScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdivinaAPPTheme{
                val navigationController = rememberNavController()
                val gameViewModel : GameViewModel by viewModels()
                NavHost(
                    navController = navigationController,
                    startDestination = Routes.MenuScreen.route
                ){
                    composable(Routes.MenuScreen.route){ MenuScreen(navController = navigationController) }
                    composable(Routes.GameScreen.route){ GameScreen(navController = navigationController, gameViewModel) }
                }
            }

        }
    }
}