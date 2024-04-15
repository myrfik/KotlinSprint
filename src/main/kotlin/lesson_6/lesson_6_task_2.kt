package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь: ")
    var numOfSecond = readln().toInt()
    val seconds = numOfSecond

    while (numOfSecond > 0) {
        println("Прошло ${numOfSecond--} секунд... ")
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд.")
}

