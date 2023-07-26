package lesson_13

fun main() {
    val phonebook = Phonebook()
    phonebook.addContacts()
    phonebook.printAllContacts()
}

class Phonebook(
    private val contacts: MutableList<Contact4> = mutableListOf()
) {
    fun addContacts() {
        addContact()
        println("\nЕсли хотите добавить новую запись, введите \\“да\\”")
        var answer = readln().lowercase()

        while (answer == "да") {
            addContact()
            println("\nЕсли хотите добавить новую запись, введите \\“да\\”")
            answer = readln().lowercase()
        }
    }

    private fun addContact() {
        println("\nВведите имя:")
        var name = readln()
        if (name.isEmpty()) name = "null"

        println("\nВведите номер телефона:")
        val number = readln().toLongOrNull()

        println("\nВведите компанию:")
        var company = readln()
        if (company.isEmpty()) company = "null"

        if (number != null) {
            contacts.add(
                Contact4(name = name, phoneNumber = number, company = company)
            )
        }
    }

    fun printAllContacts() = contacts.forEach { it.printContact() }
}

class Contact4(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
    fun printContact() {
        val unknown = "не указано"
        println(
            "\nИмя: ${name ?: unknown} \nНомер: ${phoneNumber ?: unknown} \nКомпания: ${company ?: unknown}"
        )
    }
}