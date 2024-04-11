package org.example.lesson_5

fun main() {
    println("Для входа вприложение необходимо решить матиматический пример: 10+22 \nВведите ответ: ")
    val userResponse = readLine()!!.toInt()

    val result = if (userResponse == 32) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен!"
    }
    println(result)
}

