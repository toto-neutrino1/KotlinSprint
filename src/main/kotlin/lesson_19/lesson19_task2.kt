package lesson_19

fun main() {
    val good1 = Good(name = "футболка", id = 1, category = Category.CLOTHES)
    val good2 = Good(name = "карандаш", id = 2, category = Category.STATIONERY)
    val good3 = Good(name = "микроскоп", id = 3, category = Category.MISCELLANEOUS)

    good1.printGoodInfo()
    good2.printGoodInfo()
    good3.printGoodInfo()
}

class Good(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun printGoodInfo() = println("$id. Товар \"$name\", категория: ${getCategoryName(category)}\n")
}

fun getCategoryName(category: Category) = when(category) {
    Category.CLOTHES -> "одежда"
    Category.STATIONERY -> "канцелярские товары"
    Category.MISCELLANEOUS -> "разное"
}

enum class Category {
    CLOTHES,
    STATIONERY,
    MISCELLANEOUS
}