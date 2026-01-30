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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.adivinaapp.R
import com.example.adivinaapp.Routes
import com.example.adivinaapp.ui.theme.Purple40

@Composable
fun MenuScreen(navController: NavHostController) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(),
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(
                modifier = Modifier
                    .padding(vertical = 15.dp),
                horizontalArrangement = Arrangement.Center

                ){
                Text(
                    "Adivina el numero by Guzman Fernandez" ,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 30.dp),
                horizontalArrangement = Arrangement.Center

            ){
                Image(
                    painter = painterResource (id = R.drawable.ic_game),
                    contentDescription = "Example" ,
                 )
            }
            Row(
                modifier = Modifier
                    .height(35.dp),
                horizontalArrangement = Arrangement.Center

            ){
                Button(
                    onClick = {navController.navigate(Routes.GameScreen.route)},
                    colors = ButtonDefaults.buttonColors (
                            containerColor = Purple40,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                )
                    {
                    Text(
                        "Iniciar partida"
                    )
                }
            }
        }
    }
}