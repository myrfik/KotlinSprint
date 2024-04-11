package org.example.lesson_4

fun main() {
    val presenceOfSunnyWeather: Boolean = true
    val tentOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val favorableConditionsForLegumes =
        (presenceOfSunnyWeather && tentOpen && (airHumidity == 20) && (season != "зима"))

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditionsForLegumes")
}
