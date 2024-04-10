package org.example.lesson_2

import kotlin.math.roundToInt

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val bonus: Double = 20.0
    val bonusPercent: Double = bonus / 100
    val bonusCrystalOre: Double = crystalOre * bonusPercent
    val bonusIronOre: Double = ironOre * bonusPercent

    println("Количество бонусных материалов кристаллической руды составляет: ${bonusCrystalOre.roundToInt()} ")
    println("Количество бонусных материалов железной руды составляет: ${bonusIronOre.roundToInt()} ")

}