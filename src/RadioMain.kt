import modulo.*

fun main(args: Array<String>) {
    val mi_radio = Radio()

    println("Desea encender el radio?")
    val encender: String? = readLine()!!
    if (encender == "Si" || encender == "si") {
        mi_radio.encender()




        do {
            //MENU de encendido.
            println("""MENÚ:
            |   1.Cambiar volumen (Su volumen actual es ${mi_radio.volumen}).
            |   2. Cambiar banda (AM/FM) (Esta en la banda ${mi_radio.banda}).
            |   3. Cambiar de estación (su estacion actual es ${mi_radio.estacion}).
            |   4.Apagar.
            |   5. Salir.
            |
            |   Que desea hacer? (seleccione un número)
        """.trimMargin())

            val menu = readLine()!!.toInt()

            // Cambiar el volumen.
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

            //Cambiar banda.
            if (menu == 2){
                println("Desea cambiar a banda AM o FM?")
                val banda = readLine()!!
                when (banda){
                    "AM","am" -> mi_radio.cambiar_AM()
                    "FM","fm" -> mi_radio.cambiar_FM()
                }
            }

            //Cambiar de estación
            if (menu == 3){
                println("Desea subir o bajar de estacion?")
                val OnOff = readLine()!!
                when (OnOff) {
                    // subir de estación.
                    "Subir", "subir" -> {
                        println("Cuánto desea subir?")
                        val cambio_estacion = readLine()!!.toDouble()
                        mi_radio.subirEstacion(cambio_estacion)
                        println("Estación: ${mi_radio.estacion}")
                    }

                    // Bajar de estación.
                    "Bajar","bajar" -> {
                        println("Cuánto desea bajar?")
                        val cambio_estacion = readLine()!!.toDouble()
                        mi_radio.subirEstacion(cambio_estacion)
                        println("Estación: ${mi_radio.estacion}")
                    }
                }
            }

            //Apagar
            if (menu == 4){
                println("APAGANDO...")
                mi_radio.apagar()
            }

        } while (menu != 5)
        println(mi_radio)
    }
}




