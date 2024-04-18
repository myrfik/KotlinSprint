/*Нужно усовершенствовать таймер из задачи 6-2 так,
чтобы он показывал пользователю сколько секунд осталось в процессе отсчета.

– каждую секунду выводить сообщение такого формата: “Осталось секунд: N”;
– по истечении таймера выводить сообщение “Время вышло”;
– таймер должен быть написан, используя цикл while.*/

package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которое нужно засечь: ")
    var numOfSecond = readln().toInt()
    val seconds = numOfSecond

    while (numOfSecond > 0) {
        println("Прошло ${numOfSecond--} секунд... ")
        if (numOfSecond > 0) {
            println("Осталось $numOfSecond секунд...")
        } else {
            println("Время вышло")
        }
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд.")
}
