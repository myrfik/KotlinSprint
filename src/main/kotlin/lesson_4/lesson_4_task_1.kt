package org.example.lesson_4

fun main() {
    val reservedTablesForToday = 13
    val reservedTablesForTomorrow = 9

    val availableTablesForToday = reservedTablesForToday < NUMBER_OF_TABLES
    val availableTablesForTomorrow = reservedTablesForTomorrow < NUMBER_OF_TABLES
    println("Доступность столиков на сегодня: $availableTablesForToday \nДоступность столиков на завтра: $availableTablesForTomorrow ")
}

const val NUMBER_OF_TABLES = 13