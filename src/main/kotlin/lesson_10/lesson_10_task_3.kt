package org.example.lesson_10

fun main() {
    println("Задайте длину пароля: ")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))
}

fun generatePassword(passwordLength: Int): String {
    val numbers = ('0'..'9')
    val symbols = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    val chars = numbers + symbols
    val charForPassword = mutableListOf<Char>()

    for (i in 0 until passwordLength) {
        charForPassword.add(chars.random())
    }
    return charForPassword.shuffled().joinToString("")
}