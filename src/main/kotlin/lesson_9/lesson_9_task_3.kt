package org.example.lesson_9

fun main() {
    val ingredientPortions = mutableListOf(2, 50, 15)
    println("Введите количество порций для омлета: ")
    val numOfPortions = readln().toInt()

    val newIngredientPortions = ingredientPortions.map {
        it * numOfPortions
    }

    println(
        "На $numOfPortions порций вам понадобится: Яиц – ${newIngredientPortions[0]} шт, " +
                " молока – ${newIngredientPortions[1]} мл, сливочного масла – ${newIngredientPortions[2]}гр"
    )
}