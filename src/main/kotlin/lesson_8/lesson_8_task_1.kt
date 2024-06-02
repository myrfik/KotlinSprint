package org.example.lesson_8

fun main() {
    val viewsPerDay = arrayOf(199, 223, 158, 654, 521, 343, 551)
    var totalViews = 0

    for (i in viewsPerDay) {
        totalViews += i
    }
    println("Общее количество просмотров за неделю составило: $totalViews")
}


