package com.saket.kotlininheritance.multipleinheritance

/**
 * Interface can implement multiple interfaces. This is also example of multiple inheritance..
 *
 * Apart from eating and communication. Animal performs other tasks like sleeping, moving around,
 * hunting, etc.
 */
interface IAnimal : IEat, ICommunicate, IMove {

    var animalName: String

    var huntsForFood: Boolean

    fun sleep()

    fun wakeup()

}