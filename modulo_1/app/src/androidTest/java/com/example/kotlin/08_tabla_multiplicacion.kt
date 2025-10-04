package com.example.kotlin

fun main() {
    println("Introduce el valor a multiplicar")
    val value1: Int = readLine()?.toIntOrNull()?:0
    for (i in 0..10) {
        println("Tabla del ${value1} es: ${value1} x ${i} = ${value1*i} ")
    }

}