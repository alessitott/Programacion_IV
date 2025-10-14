package com.example.kotlin

fun main(){
    println("Ingrese su promedio")
    val promedio: Int = readLine()?.toIntOrNull()?:0
    println("Trabaja Si/No?")
    val trabaja: String = readLine()?.lowercase()?.trim() ?: ""
    when {
        promedio >=90  && trabaja == "no" -> println("Beca Completa")
        promedio >=90  && trabaja == "si" -> println("Beca parcial")
        promedio < 90  -> println("Sin Beca ")
        else -> println("Ingrese sus datos correctamente")
    }

}