package app.practice.port_control

fun main() {
    try {
        val toneladas = 1200
        val capacidadMuelle = 1000
        if (toneladas > capacidadMuelle) {
            throw IllegalArgumentException("La carga excede la capacidad del muelle")
        }
        println("Carga registrada correctamente: $toneladas toneladas")

        val costo = calcularCosto(toneladas, -50.0)
        println("Costo operativo: $$costo")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    } finally {
        println("Registro de puerto finalizado")
    }
}

fun calcularCosto(toneladas: Int, costoPorTonelada: Double): Double {
    if (costoPorTonelada < 0) throw IllegalArgumentException("El costo por tonelada no puede ser negativo")
    return toneladas * costoPorTonelada
}
