package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var numOfAttempts = 3

    while (numOfAttempts > 0) {
        val num1 = Random.nextInt(1, 10)
        val num2 = Random.nextInt(1, 10)

        println("Для входа в приложение необходимо доказать, что Вы не бот! Решите простой пример: $num1 + $num2")
        val answer = readln().toInt()

        if (answer == (num1 + num2)) {
            println("Добро пожаловать!")
            return
        } else {
            numOfAttempts--
            println("Попробуйте еще раз!")
        }
    }
    println("Доступ запрещен")

}

