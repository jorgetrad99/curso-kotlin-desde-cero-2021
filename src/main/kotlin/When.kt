
fun main (args: Array<String>) {
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> {
            println("El amarillo es el color de la alegría")
        }
        "Rojo", "Carmesi" -> println("El rojo simboliza el calor")
        else -> println("Error, no tengo información del color")
    }

    val code = 501
    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 41
    val mensaje = when (tallaDeZapatos) {
        41, 43 -> "Tenemos disponible"
        42, 44 -> "Casi no nnos quedan!"
        45 -> "Lo siento, no tenemos disponibles"
        else -> "Estos zapatos solo vienen en tallas 41, 42, 43, 44 y 45"
    }
    println(mensaje)
}