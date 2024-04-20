package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь: ")
    var numOfSecond = readln().toInt()

    while (numOfSecond > 0) {
        println("Осталось ${numOfSecond--} секунд...")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
