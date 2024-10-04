package org.example.lesson_9

fun main() {
    println("Введите пять названий ингредиентов блюда, разделяя их запятыми (с пробелом)")
    val enteredIngredient = readln()

    val ingredientList = enteredIngredient.split(", ").sorted()

    println(ingredientList)
}
