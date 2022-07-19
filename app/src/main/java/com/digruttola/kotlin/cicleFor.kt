package com.example.kotlin

fun main(args: Array<String>){
    val listaDeFrutas = listOf("Manzana","Pera","Frambueza","Durazno")

    //For
    for (fruta in listaDeFrutas){
        println("Me voy a comer: $fruta")
    }

    //ForEach
    listaDeFrutas.forEach { fruta -> println("Me comere una $fruta") }
    listaDeFrutas.forEach { println("Me comere una") }
    listaDeFrutas.forEach { fruta -> println("caracteres: ${fruta.length}")}

    //Map
    val caracteresFrutas = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresFrutas)

    //filter: mostrar bajo una condicion
    val listaFiltrada = caracteresFrutas.filter { lengthFruit -> lengthFruit > 5 }
    println(listaFiltrada)
}