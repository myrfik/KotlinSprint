package org.example.lesson_7

fun main() {
    val digit = '0'..'9'
    val letter = 'a'..'z'
    val capitalLetter = 'A'..'Z'
    val chars = digit + letter + capitalLetter

    println("Введите длину пароля (минимум 6 символов): ")
    val passwordLength = readln().toInt()

    val charForPassword = mutableListOf<Char>()
    charForPassword.add(digit.random())
    charForPassword.add(letter.random())
    charForPassword.add(capitalLetter.random())

    for (i in 0 until passwordLength) {
        charForPassword.add(chars.random())
    }

    val shuffledPassword = charForPassword.shuffled()
    val password = shuffledPassword.joinToString("")

    println("Ваш пароль: $password")
}
