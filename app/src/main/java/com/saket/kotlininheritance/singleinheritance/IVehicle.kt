package com.saket.kotlininheritance.singleinheritance

/**
 * Kotlin interface can have abstract methods and with method implementations also (default methods).
 * It can also have abstract properties or to provide accessor implementations.
 *
 * Properties in interface are abstract by default.
 *
 * Interface in Kotlin cannot have a constructor. Which is true for Java as well...
 *
 * Interface cannot store state. So property accessors do not have access to backing fields.
 */
interface IVehicle {
    //No. of wheels
    var noOfWheels: Int

    enum class ENGINE {
        COMBUSTION, ELECTRIC
    }

    //Engine type
    var engineType: ENGINE

    //Engine state
    enum class ENGINE_STATE {
        OFF, IDLE, RUNNING
    }

    var currentEngineState: ENGINE_STATE

    //Start engine
    fun startEngine() {
        currentEngineState = ENGINE_STATE.IDLE
    }

    //Stop engine
    fun stopEngine() {
        currentEngineState = ENGINE_STATE.OFF
    }

    fun isEngineOn() = currentEngineState != ENGINE_STATE.OFF

}