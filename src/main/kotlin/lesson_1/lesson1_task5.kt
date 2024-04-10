package org.example.lesson_1

fun main() {
    var secondsOfSpace: Short = 6480

    val hour: Int = secondsOfSpace / SECOND_IN_HOUR
    val remainingSeconds = secondsOfSpace % SECOND_IN_HOUR
    var minutes: Int = remainingSeconds / SECOND_IN_MINUTE
    val seconds: Int = secondsOfSpace % SECOND_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hour, minutes, seconds))
}

const val SECOND_IN_HOUR = 3600
const val SECOND_IN_MINUTE = 60