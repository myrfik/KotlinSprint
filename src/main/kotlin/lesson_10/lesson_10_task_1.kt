package org.example.lesson_10

fun main() {
    val resultForThePlayer = throwTheDice()
    println("Ход игрока...\nЗначение на кубике: $resultForThePlayer")

    val resultForTheComputer = throwTheDice()
    println("Ход компьютера...\nЗначение на кубике: $resultForTheComputer")

    if (resultForThePlayer > resultForTheComputer) {
        println("Победило человечество")
    } else if (resultForThePlayer == resultForTheComputer) {
        println("Ничейный результат")
    } else {
        println("Победила машина")
    }
}

fun throwTheDice(): Int = (1..6).random()
