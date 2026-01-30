package com.example.adivinaapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.adivinaapp.R
import com.example.adivinaapp.Routes
import com.example.adivinaapp.ViewModel.GameViewModel
import com.example.adivinaapp.ui.theme.ColorVolverAJugar
import com.example.adivinaapp.ui.theme.ColorVolverMenu
import com.example.adivinaapp.ui.theme.Purple40


@Composable
fun GameScreen(navController: NavHostController, viewModel: GameViewModel) {
    var respuesta by remember { mutableStateOf("2") }
    var acierto by remember { mutableStateOf(value = false) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column (
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxSize()
                .background(Color.LightGray),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(vertical = 10.dp)) {
                Column(
                    modifier = Modifier
                        .background(Color.LightGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(vertical = 10.dp)){
                        Text(
                            "?",
                            fontSize = 50.sp,)
                    }
                    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(vertical = 10.dp)) {
                        LinearProgressIndicator (
                            progress = {viewModel.posicionBarra},
                            color = Color.Red,
                            trackColor = Color.Green
                        )
                    }
                    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(vertical = 10.dp)) {
                        TextField (value = respuesta,
                            onValueChange = { respuesta = it },
                            label = { Text(text = "Introdueix un numero (1-10)" ) })
                    }
                    Row(horizontalArrangement = Arrangement.Center) {
                        Button(
                            onClick = {viewModel.Comparar(respuesta)},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Purple40,
                                contentColor = Color.White
                            )
                        ) {
                            Text(
                                "Comprovar"
                            )
                        }
                    }
                }
            }
            //Los dos botones inferiores
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(vertical = 20.dp)) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .background(Color.LightGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(
                        onClick = {viewModel.IniciarJuego()},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ColorVolverAJugar,
                            contentColor = Color.White
                        )
                    ){
                        Text(
                            "Tornar a jugar"
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .background(Color.LightGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {navController.navigate(Routes.MenuScreen.route)},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ColorVolverMenu,
                            contentColor = Color.White
                        )
                    ){
                        Text(
                            "Menu Principal"
                        )
                    }
                }
            }
        }
    }
}