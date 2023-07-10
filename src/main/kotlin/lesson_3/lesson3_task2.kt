package lesson_3

fun main() {

    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20
    output(surname, name, patronymic, age)

    age = 22
    surname = "Сидорова"
    output(surname, name, patronymic, age)
}

fun output(surname: String,  name: String,  patronymic: String, age: Int) {
    val yearEnding = when {
        age % 10 in 2..4 -> "года"
        age % 10 == 1 && age % 100 != 11 -> "год"
        else -> "лет"
    }
    println("$surname $name $patronymic, $age $yearEnding")
}