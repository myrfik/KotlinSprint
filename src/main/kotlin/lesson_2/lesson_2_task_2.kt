package org.example.lesson_2

fun main() {

    val numberOfWorkers: Int = 50
    val salaryOfKeyWorkers: Int = 30000
    val numberOfTrainees: Int = 30
    val traineeSalary: Int = 20000


    val payrollExpensesKeyWorkers: Int = numberOfWorkers * salaryOfKeyWorkers
    println("Расходы на выплату зарплаты постоянных сотрудников составили: $payrollExpensesKeyWorkers")


    val payrollExpenses: Int = payrollExpensesKeyWorkers + (numberOfTrainees * traineeSalary)
    println("Общие расходы по ЗП после прихода стажеров составили: $payrollExpenses ")


    val averageSalary: Int = payrollExpenses / (numberOfWorkers + numberOfTrainees)
    println("Средняя ЗП одного сотрудника после устройства стажеров составила: $averageSalary")

}
