package lesson_3

fun main() {
    var begin = "E2"
    var end = "E4"
    var moveNumber = 1
    printMoves(begin, end, moveNumber)

    begin = "D2"
    end = "D3"
    moveNumber++
    printMoves(begin, end, moveNumber)
}

fun printMoves(begin: String, end: String, moveNumber: Int) = println("$begin-$end; $moveNumber")