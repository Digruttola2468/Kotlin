package com.digruttola.kotlin.Scope

fun main(args: Array<String>){

    val colores = listOf("Azul","Amarillo","Rojo")
    //Acceder a las propiedades de la variable
    with(colores) {
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

}