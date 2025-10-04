package com.example.kotlin

fun main(){
    println("Estructuras de control")
    println("Condicionales")
    val value1=10
    val value2=15
    if (value1>value2){
    println("el mayor es ${value1}")
    } else {
        println("El mayor es ${value2}")
    }
    println("Rango segun nivel de la fuerza")
    var fuerza: Int = 10
    if (fuerza > 10){
        println("maestro")
    }  else if (fuerza > 5 ){
        println("caballero Jedi")
    } else {
        println("Padawan")
    }

    var tipoDriode: String = "C-3PO"
    when (tipoDriode){
        "R2-D2", "R2-Q5" -> println("Droide atromecanico")
        "C-3PO", "C-3PA" -> println("Droide de protocolo")
        "BB8-8", "BB-9E" -> println("Droide de nueva generacion")
        else -> println("Modelo desconocido")
    }

    var luzSemaforo: String = "verde"
    var estado: String = "vacia"
    when {
        luzSemaforo == "verde" && estado == "vacia" -> println("Avanzar")
        luzSemaforo =="amarillo" && estado == "vacia" -> println("Precaucion")
        luzSemaforo == "rojo" && estado == "Con trafico" -> println("Esperar")
        else -> println("Estado no reconocido")
    }

    var signo: String = "Cancer"
    var Fuego = listOf("Aries", "Leo", "Sagitario")
    var Tierra = listOf("Tauro", "Virgo", "Capricornio")
    var Aire = listOf("Geminis", "Libra", "Acuario")
    var Agua = listOf("Cancer", "Ess")
    when {
        signo in Fuego -> println("Tu elemento es fuego")
        signo in Tierra -> println("Tu elemento es Tierra")
        signo in Aire -> println("Tu elememnto es Aire")
        signo in Agua -> println("Tu elemento es Agua")
        else -> println("Desconocemos")
    }





}