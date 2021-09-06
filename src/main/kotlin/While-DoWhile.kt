fun main (args: Array<String>) {
    //While
    var contador = 10
    while (contador > 0) {
        println("El valor de contador es $contador")
        contador--
    }

    //Do-While
    do {
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El número aleatorio es $numeroAleatorio")
    } while (numeroAleatorio > 50)
}