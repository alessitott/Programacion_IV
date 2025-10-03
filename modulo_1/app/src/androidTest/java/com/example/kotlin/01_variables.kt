package com.example.kotlin


fun main(){
    println("Variables")
    val planeta = "Tatooine" // Constante
    var jedi = "Anekin" // Vairable

    jedi = "Oviwan"
    println("Tipos de variables")
    println("====================")
    println("Tipos numericos")
    val edad: Int = 25
    println("Int " + edad)
    val altura: Double = 25.5
    println("Double " + altura)
    val peso: Float = 25.5f
    println("Float " + peso)
    val nombre: String = "Obi-Wan Kenobi"
    println("String " + peso)
    val inical: String = "O"
    println("Char " + peso)
    val esJedi: Boolean  = true
    println("Boolean " + esJedi)

    println("nulidad")
    val apellido : String? = "Cordova"
    println(apellido)

    println("nulidad")
    val ciudad : String? = ""
    println(ciudad?.length)

    println("operacion de asercion no null")
    val longitudSegura = apellido!!.length

    println("Interpolacion de strings")
     val nombrePrincesa : String = "Leia"
     val edadPrincesa : Int = 19
     val planetaPrincesa : String = "Tierra"
    println("${nombrePrincesa.uppercase()} nacio en ${planetaPrincesa}")
    println("En 10 años tendra : ${edadPrincesa} años")

    println("String multilinea")
    val mensaje = """
        Querido $nombre
        Tu emision en $planeta
        has sido completada exitosamente
        que la fuerza te acompañe
    """
    println(mensaje)

    println("Conversiones")
    val textoEdad: String = "25"
    val edadCovertida: Int = textoEdad.toInt()
    println(edadCovertida)

    val numero: Double = 50.8
    val numeroCovertido: String = numero.toString()
    println(numeroCovertido)





}