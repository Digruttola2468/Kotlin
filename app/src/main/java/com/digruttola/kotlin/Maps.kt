package com.example.kotlin

fun main(args: Array<String>){
    //Inmutable
    val edadDeSuperHeroes = mapOf(
        "IronMan" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    //Mutable
    val edadSuperHeroesMutable = mutableMapOf(
        "IronMan" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutable)

    //Dos maneras de agregar <K,V>
    edadSuperHeroesMutable.put("Wolverine",44)
    println(edadSuperHeroesMutable)
    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    //Obtener valor de la clave [IronMain]
    val edadIronMan = edadSuperHeroesMutable["IronMan"]
    println(edadIronMan)

    //delete
    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    //Obtenemos una lista de claves <K>
    println(edadSuperHeroesMutable.keys)

    //Obtenemos una lista de valores <V>
    println(edadSuperHeroesMutable.values)

}