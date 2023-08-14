package lesson_15

fun main() {
    val forum = Forum(superAdminName = "BossAdmin")
    forum.addMessage(userId = 0, message = "Добро пожаловать на форум!")

    val user1 = forum.addUser(userId = 0, userName = "User1", isAdmin = false)
    user1?.let {
        forum.addMessage(userId = it.id, message = "Привет всем!")
    }

    val user2 = forum.addUser(userId = 0, userName = "User2", isAdmin = false)
    user2?.let {
        forum.addMessage(userId = it.id, message = "Привет, я ${it.userName}")
    }

    val user3 = forum.addUser(userId = 4, userName = "User3", isAdmin = false) // null
    user3?.let {
        forum.addMessage(userId = it.id, message = "Я ${it.userName}")
    }

    val admin1 = forum.addUser(userId = 0, userName = "Admin1", isAdmin = true)
    admin1?.let {
        forum.addMessage(userId = it.id, message = "Я ${it.userName}")
    }

    forum.addUser(userId = 3, userName = "User4", isAdmin = false)
    forum.addUser(userId = 0, userName = "User5", isAdmin = false)
    forum.printUsers()
    forum.printAdmins()
    forum.readMessages()

    forum.deleteMessage(userId = 4, messageId = 1)
    forum.deleteMessage(userId = 3, messageId = 2)
    forum.readMessages()

    forum.deleteUser(userId = 7, deletingUserId = 1)
    forum.deleteUser(userId = 0, deletingUserId = 2)
    forum.printUsers()
    forum.printAdmins()
}

class Forum(superAdminName: String) {
    private var lastUserId = 0
    private var lastMessageId = 1
    private val users: MutableList<BasicUser> = mutableListOf(Admin(id = lastUserId++, admin = superAdminName))
    private val messages: MutableList<Message> = mutableListOf()

    fun addUser(userId: Int, userName: String, isAdmin: Boolean): BasicUser? {
        return if (users.find { it.id == userId && it is Admin } != null) {
            val newUser =
                if (!isAdmin) User(id = lastUserId++, user = userName)
                else Admin(id = lastUserId++, admin = userName)
            users.add(newUser)
            newUser
        } else {
            println("Добавление пользователя \"$userName\" невозможно!\n")
            null
        }
    }

    fun addMessage(userId: Int, message: String): Message? {
        val author = users.find { it.id == userId }
        return if (author != null) {
            val newMessage = Message(id = lastMessageId++, author = author, message = message)
            messages.add(newMessage)
            newMessage
        } else {
            println("Пользователя с id = $userId не существует!")
            null
        }
    }

    fun readMessages() = println(
        messages.joinToString(separator = "\n", postfix = "\n") { "${it.author.userName}: ${it.message}" }
    )

    fun deleteMessage(userId: Int, messageId: Int): Boolean {
        return if (users.find { it.id == userId } is Admin) {
            messages.removeIf { it.id == messageId }
            true
        } else {
            println("Попытка удаления сообщения с id = $messageId пользователем с id = $userId неудачна!\n")
            false
        }
    }

    fun deleteUser(userId: Int, deletingUserId: Int): Boolean {
        return if (deletingUserId != 0 && users.find { it.id == userId } is Admin) {
            users.removeIf { it.id == deletingUserId }
            true
        } else {
            println("Попытка удаления пользователя с id = $deletingUserId пользователем с id = $userId неудачна!\n")
            false
        }
    }

    fun printUsers() = println("\nUsers: ${users.filterIsInstance<User>().joinToString(separator = ", ") { it.userName }}\n")

    fun printAdmins() = println("Admins: ${users.filterIsInstance<Admin>().joinToString(separator = ", ") { it.userName }}\n")
}

class Message(val id: Int, val author: BasicUser, val message: String)

class Admin(id: Int, admin: String) : BasicUser(id = id, userName = admin)

class User(id: Int, user: String) : BasicUser(id = id, userName = user)

abstract class BasicUser(val id: Int, val userName: String)