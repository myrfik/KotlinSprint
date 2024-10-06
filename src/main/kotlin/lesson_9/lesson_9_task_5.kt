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
        println(
            (sortedIngredientList.joinToString(separator = ", ", postfix = "."))
                .replaceFirstChar { it.uppercase() }
        )
    }
}
