package com.example.adivinaapp

sealed class Routes(val route: String) {
    object MenuScreen: Routes("Menu")
    object GameScreen: Routes("Game")
}