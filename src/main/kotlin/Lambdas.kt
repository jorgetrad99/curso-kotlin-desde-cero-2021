fun main(args: Array<String>) {
    val myLamda : (String) -> Int = { valor -> valor.length }
    val lamdaEjecutada: Int = myLamda("Hola Platzi")
    println(lamdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longuitudDeSaludos = saludos.map(myLamda)
    println(longuitudDeSaludos)
}