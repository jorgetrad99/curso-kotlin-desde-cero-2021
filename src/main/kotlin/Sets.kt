fun main(args: Array<String>){
    //Declaramos un Set
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vocalesRepetidas)

    //Declaramos un Set Mutable
    val numerosFavoritos = mutableSetOf(1, 2, 3, 4)
    println(numerosFavoritos)

    //Añadimos un elemento al Set
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    //Eliminamos ese elemento
    numerosFavoritos.remove(5)  //Pasamos el valor que queremos eliminar
    println(numerosFavoritos)

    //Encontrando el primer valor que sea mayor a 2
    val valorDelSet: Int? = numerosFavoritos.firstOrNull { numero -> numero > 2 }
    println(valorDelSet)
}