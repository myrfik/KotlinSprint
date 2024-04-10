package org.example.lesson_2

fun main() {
    val mark1: Double = 3.0
    val mark2: Double = 4.0
    val mark3: Double = 3.0
    val mark4: Double = 5.0
    val numberOfStudents: Int = 4

    val averageMark = (mark1 + mark2 + mark3 + mark4) / numberOfStudents
    println("Средний балл данного класса по английскому языку составляет: $averageMark")
}