package org.example.lesson_6

fun main() {
    println("Необходимо создать логин и пароль. Введите логин: ")
    val userLogin = readln().toString()

    println("Отлично! Придумайте и введите пароль: ")
    val userPassword = readln().toString()

    do {
        println("Введите логин: ")
        val enteredLogin = readln().toString()

        println("Введите пароль: ")
        val enteredRassword = readln().toString()
    } while ((userLogin != enteredLogin) || (userPassword != enteredRassword))

    println("Авторизация прошла успешно!")
}
