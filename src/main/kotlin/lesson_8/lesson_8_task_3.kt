package org.example.lesson_8

fun main() {
    val ingredientsForCarbonara = arrayOf("макароны", "бекон", "соль", "перец", "пармезан", "сливки")

    println("Введите ингредиент, который необходимо найти: ")

    val introducedIngredient = readln()
    val filterArray = ingredientsForCarbonara.contains(introducedIngredient)

    if (filterArray) {
        println("Ингредиент $introducedIngredient в рецепте есть")

    } else {

        println("Такого ингридиента в рецепте нет!")
    }
}

