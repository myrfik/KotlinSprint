package org.example.lesson_10

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    if (validateDataLength(login, password)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}

fun validateDataLength(login: String, password: String): Boolean {
    val maxLength = 4
    return login.length < maxLength || password.length < maxLength
}