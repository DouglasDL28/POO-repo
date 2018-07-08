package modulo

class Radio (
      var encendido: Boolean = false,
      val volumen: Int,
      val estacion: Int = 100
) {
    fun encender() {
        encendido = true
    }

    fun apagar() {
        encendido = false
    }

    fun subirEstacion (){ }

    override fun toString(): String {
        return """
            Radio:
                Volumen: $volumen
                Estación: $estacion
                Encendido: $encendido
        """.trimIndent()
    }

}