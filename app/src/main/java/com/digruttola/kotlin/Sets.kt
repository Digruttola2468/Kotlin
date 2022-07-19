package com.digruttola.kotlin

fun main(args: Array<String>){
    //Sets: No puede tener elementos repetidos
    //inmutable
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)

    //Mutable
    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet : Int? = numerosFavoritos.firstOrNull { numero -> numero > 2 }
    println(valorDelSet)
}