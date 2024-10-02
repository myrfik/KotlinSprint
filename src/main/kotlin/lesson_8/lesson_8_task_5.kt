package org.example.lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов: ")
    val quantityOfIngredients = readln().toIntOrNull() ?: return

    var ingredients = arrayOfNulls<String>(quantityOfIngredients)


    for (i in ingredients) {
        println("Введите новый ингридиент: ")
        var introducedIngredient = readln()
        ingredients = ingredients.plus(introducedIngredient)
    }

    val result = ingredients.filterNotNull().joinToString(separator = ", ")
    println("Список ингридиентов: $result")

}
