package org.example.lesson_7

fun main() {
    val digit = 0..9
    val letter = 'a'..'z'
    val passwordLength = 6
    var password = ""

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            password += digit.random()
        } else {
            password += letter.random()
        }
    }
    println(password)
}
