package org.example.lesson_4

fun main() {
    val weatherToday: Boolean = true
    val tentOpen: Boolean = true
    val airHumidityNow: Int = 20
    val seasonNow: String = "зима"

    val favorableConditionsForLegumes =
        ((weatherToday == IS_SUNNY) && (tentOpen == TENT_NOW) && (airHumidityNow == AIR_HUMIDITY) && (seasonNow != SEASON))

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditionsForLegumes")
}

const val IS_SUNNY: Boolean = true
const val TENT_NOW: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON: String = "зима"
