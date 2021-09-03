const val PI = 3.1416    //Constantes. Van fuera de la función. Se dice que declaramos en tiempo de compilación

fun main(args: Array<String>) {
    //Todo lo que esté aquí, está declarado en tiempo de ejecución
    println("Hello World!")

    var dinero : Int = 10   //Variable de lectura y escritura
    println(dinero)

    dinero = 5              //Asignando el valor 5 a la variable dinero
    println(dinero)
    val nombre : String = "Maria"    //Variable solo de lectura
    println(nombre)
    println(PI)
}