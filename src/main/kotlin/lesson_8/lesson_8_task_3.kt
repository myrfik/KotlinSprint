package org.example.lesson_8

fun main() {
    val ingredientsForCarbonara = arrayOf("макароны", "бекон", "соль", "перец", "пармезан", "сливки")

    println("Введите ингредиент, который необходимо найти: ")

    val introducedIngredient = readln()

    if (ingredientsForCarbonara.contains(introducedIngredient)) {
        println("Ингредиент $introducedIngredient в рецепте есть")

    } else {

        println("Такого ингридиента в рецепте нет!")
    }
}

