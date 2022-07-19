package com.example.kotlin

fun main(args: Array<String>) {

    var nombre: String? = null  //type null
    try {
        throw NullPointerException("Ha ocurrido un error tipo throw")
    } catch (excepcion: NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicacion")
    }

    val valor1 = 0
    val valor2 = 10
    val resultado: Int = try {
        valor1 / valor2
    } catch (ex: Exception) {
        0
    }
    println(resultado)

    //Elvis operator
    var nombre2: String? = null
    val caracteres : Int = nombre2?.length ?: 0
    println(caracteres)
}