package lesson_4

fun main() {
    val numOfDay = 4

    val exercisesToDo = """
        Упражнения для рук:    ${!isEvenDay(numOfDay)}
        Упражнения для ног:    ${isEvenDay(numOfDay)}
        Упражнения для спины:  ${isEvenDay(numOfDay)}
        Упражнения для пресса: ${!isEvenDay(numOfDay)}
    """.trimIndent()

    println(exercisesToDo)
}

fun isEvenDay(numOfDay: Int) = numOfDay % 2 == 0