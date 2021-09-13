fun main (args: Array<String>){
    //Map Inmutable
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitán América" to 99
    )
    println(edadDeSuperHeroes)

    //Map Mutable
    val edadDeSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitán América" to 99
    )
    println(edadDeSuperHeroesMutable)

    //Agregar nuevos keys con su respectivos values
    edadDeSuperHeroesMutable.put("Wolverine", 45)
    println(edadDeSuperHeroesMutable)

    edadDeSuperHeroesMutable["Storm"] = 30
    println(edadDeSuperHeroesMutable)

    //Obteniendo el valor de la clave Ironman
    //val edadIronman = edadDeSuperHeroesMutable.get("Ironman")
    val edadIronman = edadDeSuperHeroesMutable["Ironman"]
    println(edadIronman)

    //Eleminiando un Key
    edadDeSuperHeroesMutable.remove("Wolverine")
    println(edadDeSuperHeroesMutable)

    //Consultando los keys que existen en el map
    println(edadDeSuperHeroesMutable.keys)

    //Consultando los valores que existen en el map
    println(edadDeSuperHeroesMutable.values)
}