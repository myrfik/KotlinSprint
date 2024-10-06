package org.example.lesson_10

/*Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.

- пользователь сам задает длину пароля;
- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).
*/
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