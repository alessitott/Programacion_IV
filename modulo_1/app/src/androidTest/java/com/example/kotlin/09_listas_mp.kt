package app.practice.port_control

fun main() {
    println("Listas en control portuario")

    val barcosAtracados: List<String> = listOf("Santa María", "Poseidón", "Atlantis")
    println("Lista inmutable: $barcosAtracados")

    val barcosEnEspera: MutableList<String> = mutableListOf("Neptuno", "Odisea", "Titan")
    println("Lista mutable: $barcosEnEspera")
    barcosEnEspera.add("Aurora")
    println("Lista mutable: $barcosEnEspera")
    barcosEnEspera.removeAt(0)
    println("Lista mutable: $barcosEnEspera")

    for (barco in barcosEnEspera)
        println(barco)

    println("Operaciones con lista mutable")
    val muelles = mutableListOf("Norte", "Sur")
    muelles.add("Este")
    muelles += "Oeste"
    muelles.add(1, "Central")
    muelles.remove("Sur")
    muelles.removeAt(0)
    muelles[0] = "Principal"
    println(muelles)
    muelles.clear()
    println(muelles.isEmpty())

    println("Búsquedas con lista mutable")
    val capitanes = mutableListOf("Ramírez", "Lozano", "Pérez")
    println(capitanes.find { it.startsWith("L") })
    println(capitanes.firstOrNull { it.length > 6 })
    println(capitanes.any { it.contains("z") })
    println(capitanes.none { it == "Gómez" })

    println("Ordenamiento de listas")
    val tonelajes = mutableListOf(500, 1200, 800, 950, 600, 750, 950)
    println(tonelajes.sorted())
    println(tonelajes.sortedDescending())
    println(tonelajes.distinct())
}
