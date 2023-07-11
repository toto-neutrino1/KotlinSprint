package lesson_3

// Split string using multiple delimiters:
// https://stackoverflow.com/questions/46038476/how-could-i-split-a-string-into-an-array-in-kotlin

fun main() {
    val outputString = "D2-D4;0"

    val chessMoveData = outputString.split(";", "-")
    val begin = chessMoveData[0]
    val end = chessMoveData[1]
    val moveNumber = chessMoveData[2]

    println("$begin \n$end \n$moveNumber")
}