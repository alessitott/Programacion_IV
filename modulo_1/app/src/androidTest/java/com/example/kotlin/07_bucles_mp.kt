package app.practice.port_control

fun main() {
    println("Control de Puertos Marítimos")

    val barcos = listOf("Santa María", "Poseidón", "Atlantis", "Titan", "Neptuno")

    for ((index, barco) in barcos.withIndex()) {
        println("Muelle ${index + 1}: $barco atracado")
    }

    for (porcentaje in 0..100 step 25) {
        println("Cargando combustible: $porcentaje%")
    }

    println("Preparando salida del barco 'Atlantis':")
    for (countdown in 5 downTo 1) {
        println("Zarpando en: $countdown...")
    }

    println("Inspeccionando barcos...")
    for (barco in barcos) {
        if (barco == "Poseidón") {
            println("$barco presenta retraso en documentación. Saltando revisión...")
            continue
        }
        if (barco == "Titan") {
            println("$barco completó la inspección. Cerrando puerto temporalmente.")
            break
        }
        println("$barco aprobado para zarpe.")
    }
}
