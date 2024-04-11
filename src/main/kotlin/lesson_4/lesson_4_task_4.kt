package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val armAndAbdominalMuscles: Boolean = (trainingDay % 2 == 0)
    val legAndBackMuscles: Boolean = (trainingDay % 2 != 0)

    println(
        """
        Упражнения для рук:   $armAndAbdominalMuscles
        Упражнения для ног:   $legAndBackMuscles
        Упражнения для спины: $legAndBackMuscles
        Упражнения для пресса:$armAndAbdominalMuscles
    """.trimIndent()
    )
}

