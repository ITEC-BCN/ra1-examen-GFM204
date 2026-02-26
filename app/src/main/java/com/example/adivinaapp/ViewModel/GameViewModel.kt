package com.example.adivinaapp.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    var puntuacion : Float by mutableStateOf(0.00f)
        private set
    var posicionBarra : Float by mutableStateOf(0.50f)
        private set

    var numeroValidos : Array<String> = arrayOf("1","2","3","4","5","6","7","8","9","10")
        private set
    var numeroSecreto : String by mutableStateOf("1")
        private set
    fun escogerNumeroAleatorio(numeroSecreto:Int){

    }
    fun IniciarJuego(){
        posicionBarra = 1.00f
        //escogerNumeroAleatorio(numeroSecreto)
    }
    fun Comparar(respuesta : String ){
        if (respuesta == numeroSecreto){
            puntuacion = posicionBarra * 10
        }else{
            posicionBarra = posicionBarra - 0.10f
        }
    }
}


