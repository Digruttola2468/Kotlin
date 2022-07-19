package com.digruttola.kotlin.Scope

fun main(args: Array<String>){

    //Nos permite realizar una operacion para depurar el estado de tu variable
    val moviles = mutableListOf("Google Pixwl 2XL","Google Pixel 4a","Huawei Redmi 9")
        .also {
            lista -> println("El valor original $lista")
        }.asReversed()

    println(moviles)

    val peli = "papa".also { m -> println("esta $m") }.uppercase()
    println(peli)


}