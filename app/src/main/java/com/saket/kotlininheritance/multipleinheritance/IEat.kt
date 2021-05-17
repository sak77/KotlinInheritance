package com.saket.kotlininheritance.multipleinheritance

/**
 * IEat represents one of the basic attributes for all animals .i.e. eating food.
 *
 * This is required for their suvival.
 *
 * This interface provides some methods and properties related to food an animal can eat
 * and actions it can perform related to food.
 */
interface IEat {

    enum class FOOD_TYPE {
        HERBIVOROUS, CARNIVOROUS, OMNIVOROUS
    }

    var foodType: FOOD_TYPE

    fun eatFood()

    fun drinkWater()

}