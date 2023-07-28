package lesson_15

fun main() {
    val guitar = MusicalInstrument("Гитара", 10)
    val guitarAccessories1 = Accessories("струны", 100, guitar)
    guitar.search()
}

class MusicalInstrument(
    override val name: String,
    override val numOfUnitsInStock: Int
    ) : Good(), Search {
    override fun search() {
        super.search()
        print(" комплектующих к \"$name\"\n")
    }
}

class Accessories(
    override val name: String,
    override val numOfUnitsInStock: Int,
    val musicalInstrument: MusicalInstrument
) : Good()

abstract class Good {
    abstract val name: String
    abstract val numOfUnitsInStock: Int
}

interface Search {
    fun search() = print("Выполняется поиск")
}