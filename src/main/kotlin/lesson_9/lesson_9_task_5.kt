package org.example.lesson_9

fun main() {

    val ingredientList: MutableList<String> = mutableListOf()
    for (i in 1..5) {
        println("Введите ингредиент")
        val enteredIngredients = readln()
        ingredientList.add(enteredIngredients)
    }

    val sortedIngredientList = ingredientList.sorted().toSet()

    if (sortedIngredientList.isNotEmpty()) {
        val firstIngredient = sortedIngredientList.first().replaceFirstChar { it.uppercase() }

        val finalList = listOf(firstIngredient) + sortedIngredientList.drop(1)
        println(finalList.joinToString(", "))
    }
}
