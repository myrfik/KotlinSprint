package org.example.lesson_5

import java.io.File.separator
import kotlin.random.Random

fun main() {

    val random = Random
    val randomNum1 = random.nextInt(0, 42)
    val randomNum2 = random.nextInt(0, 42)
    val randomNum3 = random.nextInt(0, 42)

    val numList = mutableListOf<Int>()
    numList.add(randomNum1)
    numList.add(randomNum2)
    numList.add(randomNum3)

    println("Введите первое число: ")
    val enteredNum1 = readln().toInt()

    println("Введите второе число: ")
    val enteredNum2 = readln().toInt()

    println("Введите третье число: ")
    val enteredNum3 = readln().toInt()

    val enteredNumList = mutableListOf<Int>()
    enteredNumList.add(enteredNum1)
    enteredNumList.add(enteredNum2)
    enteredNumList.add(enteredNum3)

    val intersection = numList.intersect(enteredNumList)
    val collectionSize = intersection.size

    val result = if (collectionSize == 3) {
        "Вы угадали три числа и выиграли Джекпот!"
    } else if (collectionSize == 2) {
        "Вы угадали два числа и выиграли крупный приз"
    } else if (collectionSize == 1) {
        "Вы угадали одно число и получаете утешительный приз!"
    } else {
        "Вы не угадали ни одного числа!"
    }

    println("$result \nВыигрышные числа: ${numList.joinToString(separator = ", ")}")
}