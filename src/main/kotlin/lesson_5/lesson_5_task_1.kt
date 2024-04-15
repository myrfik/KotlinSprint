package org.example.lesson_5

fun main() {
    val num1 = 10
    val num2 = 22
    println("Для входа вприложение необходимо решить матиматический пример: $num2 + $num2 \nВведите ответ: ")
    val userResponse = readln().toInt()

    val result = if (userResponse == num1 + num2) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен!"
    }
    println(result)
}

