package org.example.lesson_4

fun main() {
    val weightOfTheFirstLoad = 20
    val volumeOfTheFirstLoad = 80
    val weightOfTheSecondLoad = 50
    val volumeOfTheSecondLoad = 100

    println(
        "Груз с весом $weightOfTheFirstLoad кг и объемом $volumeOfTheFirstLoad л соответствует категории \"Average\": " +
                "${(LIMIT_WEIGHT >= weightOfTheFirstLoad) && (weightOfTheFirstLoad > MINIMUM_WEIGHT) && (volumeOfTheFirstLoad < LIMIT_VOLUME)}"
    )

    println(
        "Груз с весом $weightOfTheSecondLoad кг и объемом $volumeOfTheSecondLoad л соответствует категории \"Average\": " +
                "${(LIMIT_WEIGHT >= weightOfTheSecondLoad) && (weightOfTheSecondLoad > MINIMUM_WEIGHT) && (volumeOfTheSecondLoad < LIMIT_VOLUME)}"
    )

}

const val MINIMUM_WEIGHT = 35
const val LIMIT_WEIGHT = 100
const val LIMIT_VOLUME = 100


