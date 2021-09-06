fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")

    //For
    for (fruta in listaDeFrutas) {
        println("Hoy voy a comerme una fruta llamada $fruta")
    }

    println()
    //For Each
    listaDeFrutas.forEach { fruta -> println("Hoy voy a comerme una fruta llamada $fruta") }    //Función anónima

    //Map
    val caracteresDeFrutas = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFrutas)

    //Filter
    val listaFiltrada = caracteresDeFrutas.filter { largoDeFrutas -> largoDeFrutas > 5 }
    println(listaFiltrada)

}