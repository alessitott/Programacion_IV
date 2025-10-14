package com.example.kotlin


fun saludar() {
    println("Hola desde una función de Kotlin")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun cuadrado(numero: Int) = numero * numero

fun retornoMultiple(a: Int, b: Int): Pair<Int, Int> {
    return Pair(a + b, a - b)
}

fun calculadora(a: Int, b: Int, signo: String): Int {
    return when (signo) {
        "+" -> a + b
        "-" -> a - b
        "/" -> a / b
        "*" -> a * b
        else -> {
            println("Ingrese los datos correctamente")
            0
        }
    }
}

fun main() {
    saludar()

    val resultado = sumar(5, 6)
    println("Suma: $resultado")

    println("Cuadrado de 5: ${cuadrado(5)}")

    val resultados = retornoMultiple(20, 12)
    println("Suma y resta: $resultados")

    val cuadradoLambda = { x: Int -> x * x }
    val saludaLambda = { nombre: String -> "Good Morning, $nombre" }

    println("Cuadrado lambda de 4: ${cuadradoLambda(4)}")
    println(saludaLambda("David"))

    println("Resultado calculadora (9 + 4): ${calculadora(9, 4, "+")}")
    println("Resultado calculadora con signo inválido: ${calculadora(9, 4, "%")}")
}
