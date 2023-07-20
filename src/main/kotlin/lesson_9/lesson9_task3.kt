package lesson_9

fun main() {
    val numOfComponentsPerOnePortion = listOf(2, 50, 15)
    println("Сколько порций омлета вы хотите приготовить?")
    val numOfPortions = readln().toInt()

    val neededComponents = numOfComponentsPerOnePortion.map { it * numOfPortions }
    println(
        "\nНа $numOfPortions порций вам понадобится: " +
                "Яиц – ${neededComponents[0]} шт, " +
                "молока – ${neededComponents[1]} мл, " +
                "сливочного масла – ${neededComponents[2]} гр."
    )
}