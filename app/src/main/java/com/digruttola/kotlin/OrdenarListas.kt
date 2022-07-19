package com.digruttola.kotlin

fun main(args: Array<String>) {
    val numeroLoteria = listOf(11,22,43,56,78,66)

    //orden ascendente
    val numerosSorted = numeroLoteria.sorted()
    println("Ascendente: $numerosSorted")

    //orden Desendiente
    val numerosSortedDesen = numeroLoteria.sortedDescending()
    println("Desendiente: $numerosSortedDesen")

    //Ascendente por condicion
    val ordenarPorMultiplos = numeroLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    //ordena aleatoriamente
    val numeroAleatorios = numeroLoteria.shuffled()
    println(numeroAleatorios)

    //imprime al reves
    val numeroEnReversa = numeroLoteria.reversed()
    println(numeroEnReversa)

    val mensajesDeNumeros = numeroLoteria.map { numero -> "Tu numero de Loteria es: $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numeroLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)
}