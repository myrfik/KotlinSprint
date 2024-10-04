package org.example.lesson_10

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    validateDataLength(login = login, password = password)
}


fun validateDataLength(login: String?, password: String?) {
    if (login?.length ?: 0 < 4 || password?.length ?: 0 < 4) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}