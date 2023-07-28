package lesson_14

fun main() {
    val post = Message("Приветствую вас!", "Bill")
    val comment = Comment(post, "Здравствуйте!", "John")
    comment.publishComment()
}

open class Message(
    val message: String,
    val authorName: String
) {
    fun publishMessage() = println("$authorName: $message\n")
}

class Comment(
    val commentedPost: Message,
    val comment: String,
    val commentator: String,
) : Message(commentedPost.message, commentedPost.authorName) {
    fun publishComment() {
        commentedPost.publishMessage()
        println("Comment: \n$commentator: $comment")
    }
}