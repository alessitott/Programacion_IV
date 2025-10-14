package app.practice.port_control

fun main() {
    println("Mapas en control portuario")

    println("Mapa inmutable")
    val capacidadBuques = mapOf(
        "Santa María" to 1200,
        "Poseidón" to 950,
        "Atlantis" to 1500,
        "Neptuno" to 800
    )
    println("Capacidad de carga de los buques: $capacidadBuques")

    println("Mapa mutable")
    val cargasCompletadas = mutableMapOf<String, Int>()
    cargasCompletadas["Santa María"] = 5
    cargasCompletadas["Poseidón"] = 3
    cargasCompletadas.put("Atlantis", 7)
    println("Cargas completadas: $cargasCompletadas")

    for ((buque, capacidad) in capacidadBuques) {
        println("$buque tiene capacidad de $capacidad toneladas")
    }

    val puertosActivos = setOf("Guayaquil", "Manta", "Esmeraldas")
    println("Puertos activos: $puertosActivos")

    val puertosEnMantenimiento = setOf("Manta", "Esmeraldas", "Bolívar")
    println("Puertos en mantenimiento: $puertosEnMantenimiento")

    println("Operaciones de conjuntos")
    val interseccion = puertosActivos intersect puertosEnMantenimiento
    val union = puertosActivos union puertosEnMantenimiento
    val diferencia = puertosActivos subtract puertosEnMantenimiento

    println("Puertos activos y en mantenimiento: $interseccion")
    println("Todos los puertos: $union")
    println("Puertos activos disponibles: $diferencia")
}
