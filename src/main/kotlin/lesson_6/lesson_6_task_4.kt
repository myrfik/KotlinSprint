package org.example.lesson_6

fun main() {
    val hiddenNum = (0..9).random()
    var numOfAttempts = 5

    while (numOfAttempts > 0) {
        println("Введите число от 1 до 9")
        var enteredNum = readln().toInt()

        if (hiddenNum == enteredNum) {
            println("Это была великолепная игра! ")
            return
        } else {
            numOfAttempts--
            println("Неверно! У Вас осталось $numOfAttempts попытки!")
        }
    }

    println("К сожалению, вы исчерпали все попытки. Загаданное число было: $hiddenNum ")
}


