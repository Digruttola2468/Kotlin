package com.digruttola.kotlin

fun main(args: Array<String>){
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!", block = {
        valor -> valor.length
    })
    println(largoDelValorInicial)

    val lambda = functionInception("Enrique")
    println(lambda)
    val valorLambda = lambda()
    println(valorLambda)
}


// (parametro,parametro con lambdas) : return
fun superFuncion(valorInicial:String , block : (String) -> Int) : Int{
    return block(valorInicial)
}

// (parametro) : return lambdas
fun functionInception(nombre : String) : () -> String{
    return {
        "Hola desde la $nombre"
    }
}