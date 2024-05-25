package org.example.lesson_7

fun main() {
    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code\nВведите код, чтобы авторизоваться: ")
        val enteredCode = readln().toInt()

        if (enteredCode == code) {
            println("Авторизация прошла успешно!")
            return
        } else {
            println("Код выслан повторно! ")
        }
    }
}

