package lesson_19

fun main() {
    val fileCard = FileCard()
    repeat(5) {
        fileCard.addHumanToFileCard()
    }

    fileCard.printFileCardData()
}

class FileCard(
    private val humans: MutableList<Human> = mutableListOf()
) {
    init {
        println("Формат ввода данных \nСначада введите имя человека, а затем через пробел -  его/её пол")
        println("Пол: м - \"мужской\", ж - \"женский\" (вводить можно в любом регистре на русскоязычной раскладке)\n")
    }

    fun addHumanToFileCard() {
        println("Введите имя и пол (м/ж):")
        var humanData = readln().split(" ")

        while (humanData.size != 2 || humanData[1].lowercase() !in listOf("м", "ж")) {
            println("Некорректный формат ввода!")
            println("Введите имя и пол (м/ж):")
            humanData = readln().split(" ")
        }

        val sex = if (humanData[1].lowercase() == "м") Sex.MALE else Sex.FEMALE

        humans.add(Human(humanData[0], sex))
    }

    fun printFileCardData() {
        humans.forEach { println("${it.name} - ${it.sex}") }
    }
}

enum class Sex {
    MALE,
    FEMALE
}

class Human(
    val name: String,
    val sex: Sex
)