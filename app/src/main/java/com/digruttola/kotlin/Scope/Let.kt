package com.digruttola.kotlin.Scope

fun main(args: Array<String>){
    var nombre : String? = null

    //Si es nulo , no muestra ningun error no esperado
    nombre?.let {
        valor -> println("El nombre no es nulo, es $valor")
    }

    nombre = "Giuseppe"
    //ejecuta el codigo solo si no es nulo
    nombre?.let {
            valor -> println("El nombre no es nulo, es $valor")
    }

}