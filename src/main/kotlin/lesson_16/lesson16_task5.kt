package lesson_16

import java.lang.Integer.max
import kotlin.math.min

fun main() {
    val player = Player(name = "Konoko", impactForce = 200, healthLevel = 89)
    player.takeDamage(70)
    player.getTreatment(100)
    player.takeDamage(200)
    player.getTreatment(100)
}

class Player(
    val name: String,
    var impactForce: Int,
    private var healthLevel: Int = 100
) {
    private var treatmentOpportunity = true

    fun getTreatment(treatment: Int) {
        if (treatmentOpportunity) {
            println("Уровень здоровья был: $healthLevel")
            healthLevel = min(100, healthLevel + treatment)
            println("После лечения уровень здоровья стал: $healthLevel\n")
        } else println("Лечение запрещено\n")
    }

    fun takeDamage(damage: Int) {
        println("Уровень здоровья был: $healthLevel")
        healthLevel = max(healthLevel - damage, 0)
        println("Уровень здоровья после урона стал: $healthLevel\n")
        if (healthLevel <= 0) death()
    }

    private fun death() {
        println("Игрок $name погиб\n")
        healthLevel = 0
        impactForce = 0
        treatmentOpportunity = false
    }
}