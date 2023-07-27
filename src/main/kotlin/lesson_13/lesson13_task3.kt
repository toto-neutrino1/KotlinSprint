package lesson_13

fun main() {
    val contacts = mutableListOf(
        NewContact("1-st", 84950000001, null),
        NewContact("2-nd", 84950000002, "P&G"),
        NewContact("3-rd", 84950000003, "Unilever"),
        NewContact("4-th", 84950000004, "PepsiCo"),
        NewContact("5-th", 84950000005, null),
        )

    printAllContacts(contacts)
}

class NewContact(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
    fun printContact() {
        val unknown = "не указано"
        println(
            "Имя: ${name ?: unknown} \nНомер: ${phoneNumber ?: unknown} \nКомпания: ${company ?: unknown} \n"
        )
    }
}

fun printAllContacts(contacts: MutableList<NewContact>) = contacts.forEach { it.printContact() }