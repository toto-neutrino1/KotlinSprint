package lesson_13

fun main() {
    val contact1 = Contact(name = "first", phoneNumber = 100, company = null)
    val contact2 = Contact(name = "second", phoneNumber = 200, company = "P&G")

    contact1.printContact()
    contact2.printContact()
}

private class Contact(
    val name: String,
    val phoneNumber: Int,
    val company: String?,
) {
    fun printContact() =
        println("name = $name \nphone number = $phoneNumber \ncompany = ${company ?: "unknown"} \n")
}