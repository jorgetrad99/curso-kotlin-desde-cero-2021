import java.lang.Exception

fun main (args: Array<String>) {
    var nombre : String? = null
    println(nombre?.length)
    try {
        //nombre!!.length
        throw NullPointerException("Referencia nula")

    } catch (exception : NullPointerException) {
        println("Ha ocurrido unn erro:r ${exception.message}")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicación")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try {
        primerValor / segundoValor
    } catch (exception : Exception) {
        0
    }
}