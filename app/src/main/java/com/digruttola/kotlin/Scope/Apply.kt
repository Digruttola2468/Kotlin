package com.digruttola.kotlin.Scope

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)


fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixwl 2XL","Google Pixel 4a","Huawei Redmi 9")
        .apply {
            removeIf {movil -> movil.contains("Google")}
        }
    println(moviles)

    //
    val colores : MutableList<String>? = mutableListOf("Amarillo","Azul","Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("Cantidad de colores es $size")
    }

}