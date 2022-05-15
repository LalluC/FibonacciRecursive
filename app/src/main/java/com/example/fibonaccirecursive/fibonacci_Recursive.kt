package com.example.fibonaccirecursive
import java.util.*
fun getFibonacci(count: Int, first: Int = 0, second: Int = 1, result: MutableList<Int> = mutableListOf()): MutableList<Int> {
    return if (count > 0) {
        result.add(first)
        getFibonacci(count - 1, second, first + second, result)
    } else {
        result
    }
}

fun main() {
    val read = Scanner(System.`in`)

    println("Enter number of terms:")
    val number = read.nextInt()

    println("\nFibonacci series of first $number terms: ")
    print(getFibonacci(number))
}