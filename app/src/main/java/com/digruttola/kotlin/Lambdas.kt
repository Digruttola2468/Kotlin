package com.digruttola.kotlin

fun main(args: Array<String>){
    val myLambda : (String) -> Int = { valor -> valor.length }
    val lambdaEjecutada = myLambda("Ivan di gruttola")
    println(lambdaEjecutada)

    val saludos = listOf("Hello","Hola","Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)

}