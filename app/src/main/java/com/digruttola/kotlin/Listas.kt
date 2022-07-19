package com.digruttola.kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){
    //Inmutables only read
    val inmutableList = listOf("Juan","Enrique","Camila")
    println(inmutableList)

    //I cant create
    //inmutableList.add

    //show first value
    val primerValor = inmutableList.first()
    println(primerValor)

    val myArray = arrayOf(1,2,3,4,5)
    println("Nuestro array: $myArray")
    println("Array como lista ${myArray.toList()}")
    //
    //
    //
    //
    //
    //
    //

    //Mutables -> CRUD (create,read,update,delete)
    val mutableList = mutableListOf<String>()
    println(mutableList)

    //add
    mutableList.add("Ian")
    println(mutableList)

    //read
    val valorUsandoGet = mutableList.get(0)
    println(valorUsandoGet)
    val valorUsandoOperador = mutableList[0]
    println(valorUsandoOperador)

    //update
    mutableList[0] = "Ivan"
    println(mutableList)

    //delete position 0
    mutableList.removeAt(0)
    println(mutableList)

    //delete string
    mutableList.remove("Ian")
    println(mutableList)

}