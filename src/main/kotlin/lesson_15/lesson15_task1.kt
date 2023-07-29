package lesson_15

fun main() {
    val carp = CrucianCarp()
    val seagull = SeagullBird()
    val duck = Duck()

    carp.toSwim()
    seagull.toFly()
    duck.toFly()
    duck.toSwim()
}

class CrucianCarp() : Swimming {
    override fun toSwim() {
        print("Карась ")
        super.toSwim()
    }
}

class SeagullBird() : Flying {
    override fun toFly() {
        print("Чайка ")
        super.toFly()
    }
}

class Duck() : Flying, Swimming {
    override fun toFly() {
        print("Утка ")
        super.toFly()
    }

    override fun toSwim() {
        print("Утка ")
        super.toSwim()
    }
}

interface Flying {
    fun toFly() = println("умеет летать")
}

interface Swimming {
    fun toSwim() = println("умеет плавать")
}