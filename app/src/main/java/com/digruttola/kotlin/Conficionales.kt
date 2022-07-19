package com.digruttola.kotlin

fun main(args: Array<String>){
    val nombre = ""

    //
    if(nombre.contains("a"))
        println("Contiene la letra a")

    //
    if(nombre.isEmpty())
        println("Esta vacio")

    //
    if(nombre.isNotEmpty()) println("El largo de nuestra variable: ${nombre.length}")
    else println("Error, La variable esta vacia")

    //
    var mensaje : String = if(nombre.length > 4) "Tu nombre es largo"
    else if (nombre.isEmpty()) "Nombre vacio"
    else "Tu nombre es corto"

    println(mensaje)

    var isName : Boolean = false
    //if isName == true
    if(isName)
        println("Is true")
    else
        println("Is false")


    var age : Int = 10
    if(age >= 18)
        println("Puede pasar porque es mayor a +18")
    else
        println("No puede pasar")
}