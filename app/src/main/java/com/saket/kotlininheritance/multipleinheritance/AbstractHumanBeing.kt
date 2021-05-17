package com.saket.kotlininheritance.multipleinheritance

/*
Abstract class does NOT have to implement all methods of the interface.

 */
abstract class AbstractHumanBeing : IHumanBeing {

    override var animalName: String = "Human Being"

    override var huntsForFood: Boolean
        get() = false
        set(value) {}

    override fun sleep() {
        println("Person is sleeping now")
    }

    override fun wakeup() {
        println("Person woke up")
    }
}