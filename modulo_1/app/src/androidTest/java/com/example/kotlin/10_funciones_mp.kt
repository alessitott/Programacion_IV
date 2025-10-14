package app.practice.port_control

fun main() {
    println("Sistema de Control de Arribo y Salida de Barcos")

    registrarArribo("Santa María", "08:30")
    registrarArribo("Neptuno", "09:15")

    val tiempoCarga = calcularTiempoCarga(5.5, 8.0)
    println("Tiempo total de carga: $tiempoCarga horas")

    val costoTotal = calcularCostoOperativo(toneladas = 1200, costoPorTonelada = 35.0)
    println("Costo total operativo: $$costoTotal")

    val estadoPuerto = verificarDisponibilidad(4)
    println("Estado actual del puerto: $estadoPuerto")

    val mensajeFinal = generarReporte("Neptuno", tiempoCarga, costoTotal)
    println(mensajeFinal)
}

fun registrarArribo(nombreBarco: String, hora: String) {
    println("Barco $nombreBarco arribó al puerto a las $hora")
}

fun calcularTiempoCarga(inicio: Double, fin: Double): Double {
    return fin - inicio
}

fun calcularCostoOperativo(toneladas: Int, costoPorTonelada: Double): Double {
    return toneladas * costoPorTonelada
}

fun verificarDisponibilidad(muellesOcupados: Int): String {
    return if (muellesOcupados < 5) "Disponible" else "Ocupado"
}

fun generarReporte(nombreBarco: String, tiempo: Double, costo: Double): String {
    return "El barco $nombreBarco completó su carga en $tiempo horas con un costo de $$costo"
}
