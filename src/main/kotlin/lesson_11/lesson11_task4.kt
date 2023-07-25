package lesson_11

fun main() {
    val closePeople = mutableListOf(
        ClosePerson("жена", "userName"),
        ClosePerson("подруга", "userName"),
        ClosePerson("подруга", "userName")
    )

    val testContact = Contact(
        name = "First Name",
        surname = "Second name",
        mobilePhone = "8 (999) 999-42-42",
        homePhone = "8 (999) 888-42-42",
        iCloud = "mail@mail.ru",
        closePeople = closePeople
    )
}

class Contact(
    val name: String,
    val surname: String,
    val mobilePhone: String,
    val homePhone: String,
    val iCloud: String,
    private val closePeople: MutableList<ClosePerson> = mutableListOf(),
) {
    fun clickSendMessage() = println("Сообщение...")

    fun clickCall() = println("Звонок...")

    fun clickVideo() = println("Видео звонок...")

    fun clickEmail() = println("Почта...")

    fun clickFaceVideo() = println("Видео FaceTime...")

    fun clickFaceCall() = println("Звонок FaceTime...")

    fun addToClosePeople() {
        println("Кого хотите добавить в список близких? Введите имя в поле ниже:")
        val name = readln()
        println("Введите ник человека:")
        val nick = readln()
        closePeople.add(ClosePerson(name, nick))
    }
}

class ClosePerson(
    val name: String,
    val nick: String
)