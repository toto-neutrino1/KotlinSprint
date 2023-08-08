package lesson_17

fun main() {
    val secretFolder = Folder(name = "Secret", numberOfFiles =  100, isSecret = true)
    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов в папке: ${secretFolder.numberOfFiles}")
}

class Folder(
    name: String,
    numberOfFiles: Int,
    private var isSecret: Boolean = false
) {
    val name: String = name
        get() = if (isSecret) "скрытая папка" else field

    val numberOfFiles: Int = numberOfFiles
        get() = if (isSecret) 0 else field
}