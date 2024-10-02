package org.example.lesson_8

fun main() {
    val ingredientsForPasta = arrayOf("макароны", "бекон", "соль", "перец", "пармезан", "сливки")
    println("Список ингридиентов для пасты: ")

    for (ingredient in ingredientsForPasta) {
        println(ingredient)
    }

    println("Введите ингридиент, который необходимо заменить")
    val replacementIngredient = readln()

    println("Введите ингридиент, который необходимо добавить")
    val newIngredient = readln()

    val index = ingredientsForPasta.indexOf(replacementIngredient)


    if (index != -1) {
        ingredientsForPasta[index] = newIngredient
        for (ingredient in ingredientsForPasta) {
            println(ingredient)
        }
    } else {
        println("Такого ингридиента нет в списке")
    }
}

