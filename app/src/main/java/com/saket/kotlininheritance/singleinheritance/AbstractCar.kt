package com.saket.kotlininheritance.singleinheritance

/**
 * Abstract class can have one or more abstract methods..
 *
 * An abstract member does not have an implementation in its class.
 *
 * You don't need to annotate an abstract class or function with open.
 *
 * Does Abstract class have to implement all interface methods? Maybe only the unimplemented ones...
 *
 * AbstractCar is an abstract class that implements interface IVehicle
 */
abstract class AbstractCar : IVehicle {

    //Car model
    abstract var modelName: String

    override var noOfWheels: Int = 4

    /*
    Use super keyword to invoke parent's method
     */
    override fun startEngine() {
        super.startEngine()
        println("Starting engine...set engine state to idle")
    }

    override fun stopEngine() {
        super.stopEngine()
        println("Stopping engine...set engine state to off")
    }

    //No of doors
    abstract var noOfDoors: Int

    //Category
    enum class CATEGORY {
        HATCHBACK, SUV, SEDAN
    }

    abstract var carType: CATEGORY

}