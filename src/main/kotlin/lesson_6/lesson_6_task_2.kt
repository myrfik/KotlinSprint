package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь: ")
    val numOfSecond = readln().toInt()

    Thread.sleep((numOfSecond * 1000).toLong())
    println("Прошло $numOfSecond секунд.")
}

