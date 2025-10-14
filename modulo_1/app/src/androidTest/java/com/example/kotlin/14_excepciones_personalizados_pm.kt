package app.practice.port_control

class ExcesoDeCargaException(message: String) : Exception(message)
class BarcoNoAutorizadoException(nombreBarco: String, message: String) : Exception(message)

fun registrarBarco(
    nombreBarco: String,
    toneladas: Int,
    capacidadMuelle: Int,
    autorizado: Boolean
): String {
    return try {
        when {
            toneladas > capacidadMuelle -> throw ExcesoDeCargaException("Carga de $toneladas toneladas excede la capacidad del muelle $capacidadMuelle")
            !autorizado -> throw BarcoNoAutorizadoException(nombreBarco, "Barco $nombreBarco no autorizado para zarpar")
            else -> "Barco $nombreBarco registrado correctamente con $toneladas toneladas"
        }
    } catch (e: ExcesoDeCargaException) {
        "Error: ${e.message}. Reduzca la carga antes de registrar."
    } catch (e: BarcoNoAutorizadoException) {
        "Error: ${e.message}. Contacte con la autoridad portuaria."
    } catch (e: Exception) {
        "Error inesperado: ${e.message}"
    } finally {
        "Reporte de registro enviado"
    }
}

fun main() {
    println(registrarBarco("Santa María", 1200, 1000, true))
    println(registrarBarco("Neptuno", 800, 1000, false))
    println(registrarBarco("Odisea", 700, 1000, true))
}
