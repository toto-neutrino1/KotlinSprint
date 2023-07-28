package lesson_15

fun main() {
    val admins = MutableList(3) { Admin("admin${it + 1}") }
    val users = MutableList(5) { User("user${it + 1}") }

    val forum = Forum(admins, users)
    forum.admins[2].writeMessage("Добро пожаловать на форум!", forum.messages)
    forum.users[1].writeMessage("Привет!", forum.messages)
    forum.users[0].writeMessage("Какие планы?", forum.messages)
    forum.admins[1].writeMessage("Учимся!", forum.messages)
    forum.readMessages()

    forum.admins[0].deleteMessage("user2: Привет!", forum.messages)
    forum.readMessages()
    forum.printUsers()

    forum.admins[2].deleteUser("user1", forum.users)
    forum.printUsers()
    forum.printAdmins()
}

class Forum(
    val admins: MutableList<Admin>,
    val users: MutableList<User> = mutableListOf(),
    val messages: MutableList<String> = mutableListOf()
) {
    fun readMessages() = admins[0].readMessages(messages)

    fun printUsers() = println("\nUsers: ${users.joinToString(separator = ", ") { it.user }}")

    fun printAdmins() = println("Admins: ${admins.joinToString(separator = ", ") { it.user }}")
}

class Admin(admin: String) : User(admin) {
    fun deleteMessage(message: String, messages: MutableList<String>) {
        messages.remove(message)
    }

    fun deleteUser(user: String, users: MutableList<User>) {
        users.removeIf { it.user == user }
    }
}

open class User(val user: String) : BasicUser() {
    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add("$user: $message")
    }
}

abstract class BasicUser {
    fun readMessages(messages: MutableList<String>) = println(messages.joinToString(separator = "\n", postfix = "\n"))
    abstract fun writeMessage(message: String, messages: MutableList<String>)
}