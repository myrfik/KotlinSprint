package org.example.lesson_7

fun main() {
    println("Введите количество секунд, которое необходимо засечь: ")
    val enteredNum = readln().toInt()

    for (i in enteredNum downTo 0) {
        println("До конца таймера осталось: $i")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
