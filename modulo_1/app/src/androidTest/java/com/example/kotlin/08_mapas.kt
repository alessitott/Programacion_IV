package com.example.kotlin

fun main() {
    println("Maps")
    println("Mapa inmutable")

    val fuerzaJedis = mapOf(
        "Luke" to 85,
        "Lola" to 86,
        "Obi- Wan" to 95,
        "Yoda" to 100
    )
    println("Fuerza de los Jedis: $fuerzaJedis")

    println("Mapa Mutable")

    val misionesCompletadas = mutableMapOf<String, Int>()
    misionesCompletadas["Luke"] = 15
    misionesCompletadas["Lein"] = 12
    misionesCompletadas.put("Man", 20)

    println("Misiones: $misionesCompletadas")

    for ((jedi, fuerza) in fuerzaJedis) {
        println("$jedi tiene nivel de fuerza $fuerza")
    }

    val planetaVisitados = setOf("Ttooine", "Corruuscan", "tierra")
    println("Planetas visitados: $planetaVisitados")

    val planetasPeligros = setOf("Ttooine", "Corruuscan", "tierra")
    println("Planetas Peligrosos: $planetasPeligros")

    println("Operaciones de conjuntos")
    val interseccion = planetasPeligros intersect planetaVisitados
    val union = planetasPeligros union planetaVisitados
    val diferencia = planetasPeligros subtract planetaVisitados

    println("Planetas visitados y peligrosos: $interseccion")
    println("Todos los planetas: $union")
    println("Planetas seguros visitados: $diferencia")


}
