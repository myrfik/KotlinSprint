package org.example.lesson_4

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Присутствуют ли повреждения корпуса? (true/false): ")
    val hullDamages = scanner.nextBoolean()

    println("Введите текущий состав экипажа: ")
    val crewComposition = scanner.nextInt()

    println("Введите количество ящиков с провизией на борту: ")
    val amountOfProvisions = scanner.nextInt()

    println("Благоприятные ли условия для отправления корабля в плавание? (true/false): ")
    val weatherConditions = scanner.nextBoolean()

    val favorableConditions = (!hullDamages && ((crewComposition > MIN_CREW_SIZE)
            && (crewComposition <= MAX_CREW_SIZE)) && (amountOfProvisions > MIN_AMOUNT_PROVISION) &&
            (weatherConditions || !weatherConditions)) || (hullDamages && (crewComposition == MAX_CREW_SIZE)
            && (amountOfProvisions >= MIN_AMOUNT_PROVISION))

    println("Корабль может отправиться в плавание: $favorableConditions")
}
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_AMOUNT_PROVISION = 50