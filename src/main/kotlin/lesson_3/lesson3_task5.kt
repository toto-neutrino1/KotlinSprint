package lesson_3

fun main() {
    val outputString = "D2-D4;0"

    val indexOfDash = outputString.indexOf('-')
    //val indexOfSemicolon = outputString.indexOf(';')

    val begin = outputString.take(2)
    val end = outputString.slice(indexOfDash + 1..indexOfDash + 2)
    val moveNumber = outputString.substringAfter(';')

    println("$begin \n$end \n$moveNumber")
}