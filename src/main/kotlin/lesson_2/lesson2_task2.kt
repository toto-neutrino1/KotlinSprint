package lesson_2

fun main() {
    val numOfConstantWorkers = 50
    val salaryOfConstantWorker = 30000

    val constantCosts = numOfConstantWorkers * salaryOfConstantWorker

    val numOfInterns = 30
    val salaryOfIntern = 20000
    val internCosts = numOfInterns * salaryOfIntern

    val allCosts = constantCosts + internCosts

    val meanSalary = allCosts / (numOfConstantWorkers + numOfInterns)

    println("$constantCosts \n$allCosts \n$meanSalary")

}