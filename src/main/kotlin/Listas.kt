fun main(args: Array<String>) {
    //Lista Inmutable
    val listaDeNombres = listOf<String>("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    //Lista mutable
    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    //Añadiendo un elemento a la lista
    listaVacia.add("Juan")
    println(listaVacia)

    //Valor de un índice de una lista usando GET
    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    //Valor de un índice de una lista usando Operator
    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    //Encuentra el valor del primer elemento de la lista
    val primerValor: String? = listaDeNombres.firstOrNull()
    println(primerValor)

    //Eliminando el elemento 0 de una lista
    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    listaVacia.add("Ef")
    println(listaVacia)

    //Eliminando elementos de una lista de acuerdo a una condición
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    //Array de enteros
    val myArray = arrayOf(1, 2, 3)
    println("Nuestro Array $myArray")
    println("Nuestro Array como Lista ${myArray.toList()}")
}