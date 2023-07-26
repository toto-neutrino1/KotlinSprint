package lesson_13

fun main() {
    val contact = Contact2(name = "Ростислав", phoneNumber = 89123456789, company = null)
    contact.printContact()
}

private class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContact() =
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "не указано"} \n")
}