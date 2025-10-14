package app.practice.port_control

enum class TipoBarco(
    val capacidadMax: Int,
    val esCargaPesada: Boolean
) {
    CARGA_LIGERA(500, false) {
        override fun descripcion() = "Barco pequeño para cargas ligeras"
    },
    CARGA_MEDIA(1000, false) {
        override fun descripcion() = "Barco mediano para cargas generales"
    },
    CARGA_PESADA(2000, true) {
        override fun descripcion() = "Barco grande para cargas pesadas"
    },
    PASAJEROS(800, false) {
        override fun descripcion() = "Barco diseñado para transporte de pasajeros"
    };

    abstract fun descripcion(): String

    companion object {
        fun porCapacidad(capacidad: Int) = values().find { capacidad <= it.capacidadMax }
    }
}

class Barco(
    val nombre: String,
    val tipo: TipoBarco,
    val muelleAsignado: Int
) {
    fun zarpar() = "El barco $nombre asignado al muelle $muelleAsignado está zarpando"
    fun info() = "${tipo.descripcion()} - Capacidad máxima ${tipo.capacidadMax} toneladas"
}

fun main() {
    val santaMaria = Barco("Santa María", TipoBarco.CARGA_MEDIA, 2)
    println(santaMaria)
    println(santaMaria.zarpar())
    println(santaMaria.info())

    val neptuno = Barco("Neptuno", TipoBarco.CARGA_PESADA, 3)
    println(neptuno)
    println(neptuno.zarpar())
    println(neptuno.info())

    val barcoPorCapacidad = TipoBarco.porCapacidad(700)
    println("Barco adecuado para 700 toneladas: $barcoPorCapacidad")
}
