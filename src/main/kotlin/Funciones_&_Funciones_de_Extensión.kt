fun main(args: Array<String>){
    val fraseAleatoria = "En Platzi nunca paramos de aprender :)"
    imprimirFrase(fraseAleatoria)
    println(fraseAleatoria.randomCase())
}

fun imprimirFrase(frase: String) : Unit {
    println("Tu frase es: $frase")
}

fun String.randomCase() : String {
    val numeroAleatorio = 0..99     //Rango de números
    val resultadoAleatorio = numeroAleatorio.random()   //número aleatorio entre el 0 y 99

    return if(resultadoAleatorio.rem(2) == 0) {     //Si el numero aleatorio es Par, entonces
        this.uppercase()
    } else {                    //Si es Impar, entonces
        this.lowercase()
    }
}

/*
fun randomCase(frase: String) : String {
    val numeroAleatorio = 0..99     //Rango de números
    val resultadoAleatorio = numeroAleatorio.random()   //número aleatorio entre el 0 y 99

    return if(resultadoAleatorio.rem(2) == 0) {     //Si el numero aleatorio es Par, entonces
        frase.uppercase()
    } else {                    //Si es Impar, entonces
        frase.lowercase()
    }
}
 */