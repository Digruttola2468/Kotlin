package com.digruttola.kotlin

import java.util.*

fun main(args : Array<String>){
    println("Hola kotlin")

    var nombreString : String = "Juan"
    var edadInteger : Int = 10
    var fecha : Date = Date()
    var sueldo : Double = 10000.0 //Float
    var byte : Byte = 13

    println("Nombre: ${nombreString.toUpperCase()}")
    println("Edad: ${edadInteger + 1}")
    println("Fecha: $fecha")
    println("Sueldo: $sueldo")
    println("Byte: $byte")
}