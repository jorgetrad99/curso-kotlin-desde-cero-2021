fun main(args: Array<String>) {
    //imprimirNombre("Jorge", "Trad")
    imprimirNombre(nombre = "Jorge", apellido = "Trad")
}

fun imprimirNombre (nombre: String, segundoNombre: String = "", apellido: String) {
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}