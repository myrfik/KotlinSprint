package org.example.lesson_7

fun main() {
    println("Введите число: ")
    val enteredNum = readln().toInt()

    for (i in 0..enteredNum step 2) {
        println(i)
    }
}

