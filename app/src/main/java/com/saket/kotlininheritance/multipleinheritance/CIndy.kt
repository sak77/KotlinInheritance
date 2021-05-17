package com.saket.kotlininheritance.multipleinheritance

/**
 *
 */
class CIndy : AbstractHumanBeing() {

    override var profession: String = "Teacher"

    override var name: String = "Cindy"

    override var age: Int = 46

    override var foodType: IEat.FOOD_TYPE = IEat.FOOD_TYPE.HERBIVOROUS

    override fun eatFood() {
        println("Cindy is eating food.")
    }

    override fun drinkWater() {
        println("Cindy is drinking water")
    }

    override var communicationModes : List<ICommunicate.COMMUNICATION_MODES> = listOf(ICommunicate.COMMUNICATION_MODES.NONVERBAL,
    ICommunicate.COMMUNICATION_MODES.VERBAL, ICommunicate.COMMUNICATION_MODES.WRITTEN)

    override fun talk() {
        println("Cindy is talking")
    }

    override fun listen() {
        println("Cindy is listening")
    }
}