package org.example.lesson_3

fun main() {
    val sourceString: String = "D2-D4;0"
    val (whence, wherever, moveNumber) = sourceString.split("-", ";")
    println(
        """
        |$whence
        |$wherever
        |$moveNumber
    """.trimMargin()
    )

}