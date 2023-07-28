package lesson_15

fun main() {
    val carp = CrucianCarp()
    val seagull = SeagullBird()
    val duck = Duck()

    carp.canSwim()
    seagull.canFly()
    duck.canFly()
    duck.canSwim()
}

class CrucianCarp() : Swimming {
    override fun canSwim() {
        print("Карась ")
        super.canSwim()
    }
}

class SeagullBird() : Flying {
    override fun canFly() {
        print("Чайка ")
        super.canFly()
    }
}

class Duck() : Flying, Swimming {
    override fun canFly() {
        print("Утка ")
        super.canFly()
    }

    override fun canSwim() {
        print("Утка ")
        super.canSwim()
    }
}

interface Flying {
    fun canFly() = println("умеет летать")
}

interface Swimming {
    fun canSwim() = println("умеет плавать")
}