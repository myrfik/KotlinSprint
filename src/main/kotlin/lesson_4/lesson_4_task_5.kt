package org.example.lesson_4

import java.util.Scanner

fun main() {

    println("Присутствуют ли повреждения корпуса? (true/false): ")
    val hullDamages = readln().toBoolean()

    println("Введите текущий состав экипажа: ")
    val crewComposition = readln().toInt()

    println("Введите количество ящиков с провизией на борту: ")
    val amountOfProvisions = readln().toInt()

    println("Благоприятные ли условия для отправления корабля в плавание? (true/false): ")
    val weatherConditions = readln().toBoolean()

    val favorableConditions = ((hullDamages == IS_DAMAGE) && ((crewComposition > MIN_CREW_SIZE)
            && (crewComposition <= MAX_CREW_SIZE)) && (amountOfProvisions > MIN_AMOUNT_PROVISION) &&
            ((weatherConditions == WEATHER) || (weatherConditions != WEATHER))) || ((hullDamages != IS_DAMAGE) &&
            (crewComposition == MAX_CREW_SIZE) && (amountOfProvisions >= MIN_AMOUNT_PROVISION))

    println("Корабль может отправиться в плавание: $favorableConditions")
}

const val IS_DAMAGE = false
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_AMOUNT_PROVISION = 50
const val WEATHER = true