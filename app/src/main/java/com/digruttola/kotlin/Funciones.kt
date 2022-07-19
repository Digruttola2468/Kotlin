package com.example.kotlin

fun main(args: Array<String>){
    //----------1-----------
    /*val fraseAleatoria = "En Platzi nunca se para de aprender"
    val fraseOrdenada = randomCase(fraseAleatoria)

    imprimirFrase(randomCase(fraseAleatoria))*/

    val fraseAleatoria = "En Platzi nunca se para de aprender".randomCase()
    imprimirFrase(fraseAleatoria)

    val tam = getLength(fraseAleatoria)
    if(tam > 10) println("Frase larga")
    else println("Frase corta")
}

fun getLength(frase : String) : Int{
    return frase.length
}

fun imprimirFrase(frase : String) : Unit{
    println("Tu frase es $frase")
}

fun String.randomCase() : String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()

    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    }else
        this.toLowerCase()
}

/*----------1-----------
fun randomCase(frase : String) : String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()

    return if (resultadoAleatorio.rem(2) == 0){
        frase.toUpperCase()
    }else
        frase.toLowerCase()
}
* */

