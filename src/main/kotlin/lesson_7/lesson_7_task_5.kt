package org.example.lesson_7

fun main() {
    val digit = 0..9
    val letter = 'a'..'z'
    val capitalLetter = 'A'..'Z'
    var password = ""

    println("Введите длину пароля (минимум 6 символов): ")
    val passwordLength = readln().toInt()

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password += digit.random()
        } else if (i % 3 == 0) {
            password += letter.random()
        } else {
            password += capitalLetter.random()
        }
    }

    val shuffledPassword = password.toList().shuffled()
    val resultPassword = shuffledPassword.joinToString("")

    println("Ваш пароль: $resultPassword")
}
