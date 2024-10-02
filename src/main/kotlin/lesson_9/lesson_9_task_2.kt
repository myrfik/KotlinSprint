package org.example.lesson_9

fun main() {

    val listOfIngredient = mutableListOf("молоко", "яйцо", "соль")

    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredient.forEach {
        println(it)
    }
    println("Желаете добавить еще?")
    val enteredAnswer = readln()

    if (enteredAnswer == "да") {

        println("Какой ингредиент вы хотите добавить?")
        val enteredIngredient = readln()

        listOfIngredient.add(enteredIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ")
        listOfIngredient.forEach {
            println(it)
        }
    } else {
        return
    }
}
