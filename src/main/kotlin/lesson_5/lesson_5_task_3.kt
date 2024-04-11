package org.example.lesson_5

fun main() {
    val winningNum1 = 4
    val winningNum2 = 23

    println("Введите первое число: ")
    val enteredNum1 = readLine()!!.toInt()

    println("Введите второе число: ")
    val enteredNum2 = readLine()!!.toInt()

    val result = if ((enteredNum1 == winningNum1 || enteredNum1 == winningNum2)
        && (enteredNum2 == winningNum1 || enteredNum2 == winningNum2)
    ) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((enteredNum1 == winningNum1 || enteredNum1 == winningNum2)
        || (enteredNum2 == winningNum1 || enteredNum2 == winningNum2)
    ) {
        "Вы выиграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(result)
}

