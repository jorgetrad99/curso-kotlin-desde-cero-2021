fun main(args: Array<String>) {
    val largoDeValorInicial = superFuncion(valorInicial = "Hola", block = { valor -> valor.length })
    println(largoDeValorInicial)

    val lamda: () -> String = functionInsepction(nombre = "Enrique")    //Digamos que esta instancia la encapsulamos en una función
    val valorLamda: String = lamda()    //Con esto desencapsulamos la instancia y accedemos al valor
    println(valorLamda)
}

fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
}

fun functionInsepction(nombre: String): () -> String {
    return {
        "Hola desde la lamda $nombre"
    }
}