package org.example.lesson_7

fun main() {
    println("Введите число: ")
    val enteredNum = readln().toInt()

    for (i in 0 until enteredNum step 2) {
        if (i == 0) {
            continue
        }
        println(i)
    }
}

