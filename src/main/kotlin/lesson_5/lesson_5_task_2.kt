package org.example.lesson_5

fun main() {
    println("Введите свой год рождения: ")
    val userYearOfBirth = readLine()!!.toInt()

    val thisYear = 2024
    val userAge = thisYear - userYearOfBirth

    val result = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться на главный экран"
    }
    println(result)
}

const val AGE_OF_MAJORITY = 18

