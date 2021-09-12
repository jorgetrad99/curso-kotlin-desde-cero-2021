fun main (args: Array<String>) {
    val numeroDeLoteria = listOf(11, 22, 43, 56, 78, 66)
    println("Lista Original: " + numeroDeLoteria)
    val numeroSorted = numeroDeLoteria.sorted()
    println("Lista Ordenada Ascendentemente: " + numeroSorted)

    val numeroDeLoteriaDescendente = numeroDeLoteria.sortedDescending()
    println("Lista Ordenada Ascendentemente: " + numeroDeLoteriaDescendente)

    val ordenarPorMultiplos = numeroDeLoteria.sortedBy { numero -> numero < 50 }
    println("Lista Ordenada con cierta condición " + ordenarPorMultiplos)

    val numerosAleatorios = numeroDeLoteria.shuffled()
    println("Lista Ordenada Aleatoriamente " + numerosAleatorios)

    val numerosEnReversa = numeroDeLoteria.reversed()
    println("Lista en Reversa " + numerosEnReversa)

    val mensajesDeNumeros = numeroDeLoteria.map { numero -> "Un numero de loteria es: $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numeroDeLoteria.filter { numero -> numero > 50 }
    println("Numeros Filtrados: " + numerosFiltrados)
}