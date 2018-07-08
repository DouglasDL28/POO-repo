import modulo.*

fun main(args: Array<String>) {
    val mi_radio = Radio ()

    println("Desea encender el radio?")
    var encender: String? = readLine()!!
    if (encender == "Si" || encender == "si") {
        mi_radio.encender()

        println("""Que desea hacer? (seleccione un número)
            |   1.Cambiar volumen (Su volumen actual es ${mi_radio.volumen}).
            |   2. Cambiar banda (AM/FM) (Esta en la banda ${mi_radio.banda}).
            |   3. Cambiar de estación (su estacion actual es ${mi_radio.estacion}).
            |   4.Apagar.
            |   5. Salir.
        """.trimMargin())

        val menu = readLine()!!.toInt()

        while (menu != 5){
            // Cambiar el volumen
            if (menu == 1) {
                println("Desea subir o bajar el volumen?")
                val subirObajar = readLine()!!

                // Subir volumen y cuánto
                if (subirObajar == "subir") {
                    println("Cuanto quiere subir el volumen?")
                    val cambio_vol = readLine()!!.toInt()
                    mi_radio.subir_volumen(cambio_vol)
                    println("Volumen: ${mi_radio.volumen}")
                }

                // Bajar volumen y cuánto
                if (subirObajar == "bajar") {
                    println("Cuanto quiere bajar el volumen?")
                    val cambio_vol = readLine()!!.toInt()
                    mi_radio.bajar_volumen(cambio_vol)
                    println("Volumen: ${mi_radio.volumen}")
                }

            }

            if (menu == 2)

        }

        println(mi_radio)


    }






}


