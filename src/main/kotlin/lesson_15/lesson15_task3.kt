package lesson_15

fun main() {
    val admins = MutableList(3) { Admin("admin${it + 1}") }
    val users = MutableList(5) { User("user${it + 1}") }
    val messages: MutableList<String> = mutableListOf()

    admins[2].writeMessage("Добро пожаловать на форум!", messages)
    users[1].writeMessage("Привет!", messages)
    users[0].writeMessage("Какие планы?", messages)
    admins[1].writeMessage("Учимся!", messages)
    admins[0].readMessages(messages)

    admins[0].deleteMessage("user2: Привет!", messages)
    admins[0].readMessages(messages)
    printUsers(users)

    admins[2].deleteUser("user1", users)
    printUsers(users)
    printAdmins(admins)
}

fun printUsers(users: MutableList<User>) = println("\nUsers: ${users.joinToString(separator = ", ") { it.user }}")

fun printAdmins(admins: MutableList<Admin>) = println("Admins: ${admins.joinToString(separator = ", ") { it.admin }}")

class Admin(val admin: String) : BasicUser() {
    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add("$admin: $message")
    }

    fun deleteMessage(message: String, messages: MutableList<String>) {
        messages.remove(message)
    }

    fun deleteUser(user: String, users: MutableList<User>) {
        users.removeIf { it.user == user }
    }
}

class User(val user: String) : BasicUser() {
    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add("$user: $message")
    }
}

abstract class BasicUser {
    fun readMessages(messages: MutableList<String>) = println(messages.joinToString(separator = "\n", postfix = "\n"))
    abstract fun writeMessage(message: String, messages: MutableList<String>)
}