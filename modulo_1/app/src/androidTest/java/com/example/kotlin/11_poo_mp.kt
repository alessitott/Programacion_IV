package app.practice.port_control

data class BarcoPuerto(
    val nombre: String,
    val toneladas: Int,
    val muelleAsignado: Int,
    val capitan: String? = null
) {
    val categoria: String
        get() = when {
            toneladas >= 1500 -> "Carga Pesada"
            toneladas >= 800 -> "Carga Media"
            else -> "Carga Ligera"
        }

    fun puedeZarpar(): Boolean = muelleAsignado > 0

    fun necesitaInspeccion(): Boolean = toneladas > 1000
}

fun main() {
    val santaMaria = BarcoPuerto(
        nombre = "Santa María",
        toneladas = 1200,
        muelleAsignado = 2,
        capitan = "Ramírez"
    )

    println(santaMaria)

    val (nombre, toneladas, muelle) = santaMaria
    println("Barco: $nombre, Tonelaje: $toneladas, Muelle asignado: $muelle")

    val neptuno = santaMaria.copy(nombre = "Neptuno", toneladas = 1600, muelleAsignado = 3)
    println("Categoría del Neptuno: ${neptuno.categoria}")
    println("Neptuno puede zarpar: ${neptuno.puedeZarpar()}")
    println("Neptuno necesita inspección: ${neptuno.necesitaInspeccion()}")
}