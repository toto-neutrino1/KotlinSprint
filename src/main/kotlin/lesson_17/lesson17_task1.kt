package lesson_17

fun main() {
    val quiz = Quiz("???", "!!!")
    println("${quiz.question} \n${quiz.answer}\n")
    quiz.question = "Какой КПД у дизельного двигателя?"
    quiz.answer = "33 %"
    println("${quiz.question} \n${quiz.answer}\n")
}

class Quiz(
    question: String,
    answer: String
) {
    var question: String = question
        set(value) {
            field = "Вопрос: $value"
        }

    var answer: String = answer
        get() = "Верный ответ: $field"
        set(value) {
            field = value
        }
}