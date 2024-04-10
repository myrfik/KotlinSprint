package org.example.lesson_2

fun main() {
    val depositAmount: Double = 70_000.000
    val interestRate: Double = 16.7 / 100
    val depositTerm: Double = 20.0

    val compoundInterestMultiplier = Math.pow((1 + interestRate), (depositTerm))
    val endDepositAmount = depositAmount * compoundInterestMultiplier

    println("Размер вклада через 20 лет составит: ${"%.3f".format(endDepositAmount)}")
}