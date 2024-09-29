package org.example.lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов: ")
    val quantityOfIngredients = readln().toInt()

    var ingredients = emptyArray<String>()


    for (i in 1..quantityOfIngredients) {
        println("Введите новый ингридиент: ")
        var introducedIngredient = readln()
        ingredients = ingredients.plus(introducedIngredient)
    }

    val result = ingredients.joinToString(separator = ", ")
    println("Список ингридиентов: $result")

}
