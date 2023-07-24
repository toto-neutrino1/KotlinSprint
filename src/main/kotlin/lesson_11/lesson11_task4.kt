package lesson_11

fun main() {
    val closePeople = mutableListOf(
        listOf("жена", "userName"),
        listOf("подруга", "userName"),
        listOf("подруга", "userName")
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
    val mainIcon: String = "",
    val name: String,
    val surname: String,
    val messageIcon: String = "", val message: String = "написать",
    val callIcon: String = "", val call: String = "вызов",
    val videoIcon: String = "", val video: String = "видео",
    val emailIcon: String = "", val email: String = "почта",
    val mobilePhone: String,
    val homePhone: String,
    val faceTime: String = "FaceTime",
    val faceTimeVideoIcon: String = "",
    val faceTimeCallIcon: String = "",
    val iCloud: String,
    private val closePeople: MutableList<List<String>> = mutableListOf(),
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
        closePeople.add(listOf(name, nick))
    }
}