package org.example.lesson_8


fun main() {
    val ingredientsForPasta = arrayOf("макароны", "бекон", "соль", "перец", "пармезан", "сливки")
    println("Список ингридиентов для пасты: ")
    var found = false

    for (ingredient in ingredientsForPasta) {
        println(ingredient)
    }

    println("Введите ингридиент, который необходимо заменить")
    val replacementIngredient = readln()

    println("Введите ингридиент, который необходимо добавить")
    val newIngredient = readln()

    for (ingredient in ingredientsForPasta) {
        if (ingredient == replacementIngredient) {
            found = true

            val index = ingredientsForPasta.indexOf(replacementIngredient)
            ingredientsForPasta[index] = newIngredient

            for (ingredient in ingredientsForPasta) {
                println(ingredient)
            }
            break
        }
    }

    if (!found) {
        println("Такого ингридиента нет в списке")
    }
}

