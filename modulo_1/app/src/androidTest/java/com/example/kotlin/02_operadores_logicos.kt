package com.example.kotlin

fun main(){
     println("Operadores logicos")
     println("bienvenidos a kotlin")

     val edad: Int = 25
     val entretenimiento: Boolean= true
     val nivel: Int = 8

    val esApto = edad >= 18 && entretenimiento && nivel > 5
    val necesitaAyuda = !entretenimiento || nivel < 3
    println("Es apto: ${esApto}")
    println("Necesita ayuda: ${necesitaAyuda}")
}