package org.example.lesson_2

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457

    val arrivalHour = ((departureHour * MINUTE_IN_HOUR) + departureMinute + travelTime) / MINUTE_IN_HOUR
    val arrivalMinute = ((departureHour * MINUTE_IN_HOUR) + departureMinute + travelTime) % MINUTE_IN_HOUR

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))
}

const val MINUTE_IN_HOUR = 60