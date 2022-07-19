package com.example.kotlin

fun main(args: Array<String>){
    val nombreColor = "Carmesi"

    when (nombreColor){
        "Amarillo" -> {
            println("El amarillo es el color de la alegria")
        }
        "Rojo","Carmesi" -> println("El rojo simboliza el calor")

        else -> println("No Existe")
    }

    val code = 210
    when(code){
        //se encuentra en
        in 200..299 -> {
            println("Todo ha ido bien")
        }
        in 300..500 -> {
            println("Algo ha fallado")
        }
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 45
    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no hay stock"
        45 -> "Lo siento no hay disponibles"
        else -> "No tenemos disponibles"
    }

    println(mensaje)

}