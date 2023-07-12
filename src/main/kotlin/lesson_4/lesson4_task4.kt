package lesson_4

// If you want to add new exercises
//    - to odd days: add to partsForOddDays
//    - to even days: add to partsForEvenDays
fun main() {
    val partsForOddDays = mutableListOf("рук", "пресса",)
    val partsForEvenDays = mutableListOf("ног", "спины",)
    val numOfDay = 5

    printExercises(partsForOddDays, partsForEvenDays, numOfDay)
}

fun isNeedToDoExercise(partsForEvenDays: MutableList<String>, partOfBody: String, numOfDay: Int): Boolean {
    val isEvenDay = numOfDay % 2 == 0
    return if (partOfBody in partsForEvenDays) isEvenDay else !isEvenDay
}

fun printExercises(
    partsForOddDays: MutableList<String>,
    partsForEvenDays: MutableList<String>,
    numOfDay: Int,
) {
    val allParts = partsForOddDays.toMutableList()
    allParts.addAll(partsForEvenDays)
    allParts.sortBy { it.length }

    val prefix = "Упражнения для"
    val rightPadding = "${allParts.last()}:".length
    val outFormat = "%s %-${rightPadding}s %b %n"
    var toDoExercise: Boolean

    var outputString = ""

    for (part in allParts) {
        toDoExercise = isNeedToDoExercise(partsForEvenDays, part, numOfDay)
        outputString += String.format(outFormat, prefix, "$part:", toDoExercise)
    }

    println(outputString)
}