const val PI = 3.1416    //Constantes. Van fuera de la función. Se dice que declaramos en tiempo de compilación

fun main(args: Array<String>) {
    //Todo lo que esté aquí, está declarado en tiempo de ejecución
    println("Hello World!")

    var dinero : Int = 10   //Variable de lectura y escritura
    println(dinero)

    dinero = 5              //Asignando el valor 5 a la variable dinero
    println(dinero)
    val unNombre : String = "Maria"    //Variable solo de lectura
    println(unNombre)
    println(PI)

    val boolean : Boolean = true
    //val numeroLargo : Long = 30000000
    //Inferencia de Tipo
    val numeroLargo = 3L    //Con esto, Kotlin ya sabe que es un Long
    val double : Double = 2.6787687
    //val float : Float = 1.1f
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10

    val tercerValor = primerValor - segundoValor
    println("El primer valor $primerValor - segundo valor $segundoValor = $tercerValor")    //Interpolación o Template: variables dentro de cadenas de texto

    //Cadenas de texto
    val apellido = "Trad"
    val nombre = "Jorge"
    val nombreCompleto = "Mi nombre completo es $nombre $apellido"
    println(nombreCompleto)
}
