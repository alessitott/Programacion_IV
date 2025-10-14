package com.example.kotlin

fun main(){
    println("Listas")
    val inmutable: List<Int> = listOf(1,2,3)
    println("Lista inmutable ${inmutable}")

    val listaMutable: MutableList<Int> = mutableListOf(4,5,6)
    println("Lista inmutable ${listaMutable}")
    listaMutable.add(7)
    println("lista mutable ${listaMutable}")
    listaMutable.removeAt(index = 0)
    println("lista mutable ${listaMutable}")

    for (mutable in listaMutable)
        println(mutable)

    println("Operaciones con Mutable List")
    val colores = mutableListOf("rojo","verde")
    colores.add("azul")
    colores+="amarillo"
    colores.add(1,"blanco")
    colores .remove("verde")
    colores.removeAt(0)
    colores[0]= "negro"
    println(colores)
    colores.clear()
    println(colores.isEmpty())

    println("Busqyedas  con Mutable list")
    val nombres = mutableListOf("juan", "luis", "pedro")
    println(nombres.find{it.startsWith("l")})
    println(nombres.firstOrNull{it.length>4})
    println(nombres.any{it.contains("p")})
    println(nombres.none {it=="x"})
    println("ordenamiento de listas")
    val numerosDesordenados = mutableListOf(0,4,4,4,5,6,3,2,6,7,8,9,4,2,4,5,3)
    println(numerosDesordenados.sorted())
    println(numerosDesordenados.sortedDescending())
    println(numerosDesordenados.distinct())
}