package org.example.lesson_8

fun main() {
    val ingredientsForCarbonara = arrayOf("макароны", "бекон", "соль", "перец", "пармезан", "сливки")
    println("Введите ингредиент, который необходимо найти: ")
    val introducedIngredient = readln()
    var found = false

    for (ingredient in ingredientsForCarbonara) {
        if (ingredient == introducedIngredient) {
            found = true
            println("Ингредиент $introducedIngredient в рецепте есть")
            break
        }
    }

    if (!found) {
        println("Такого ингредиента в рецепте нет")
    }
}



