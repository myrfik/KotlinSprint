package org.example.lesson_9

fun main() {
    val listOfIngredient = mutableListOf("молоко", "яйцо", "соль", "бекон", "перец")

    println("В рецепте есть следующие ингредиенты: ")

    listOfIngredient.forEach {
        println(it)
    }
}
