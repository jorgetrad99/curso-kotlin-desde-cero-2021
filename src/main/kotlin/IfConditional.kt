fun main(args: Array<String>) {
    val nombre = "María"

    if(nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombre es: ${nombre.length}")
    } else {
        println("Error, la variable está vacía")
    }

    val mensaje : String = if(nombre.length > 4) {
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()) {
        "Nombre está vacío"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}