package com.digruttola.kotlin.Scope

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)

fun main (args: Array<String>){

    //Realizar operaciones con esa variable
    val moviles = mutableListOf("Google Pixwl 2XL","Google Pixel 4a","Huawei Redmi 9")
        .run {
            removeIf{ movil -> movil.contains("Google") }
            this
        }
    //devolvemos la operacion aplicada
    println(moviles)



}
