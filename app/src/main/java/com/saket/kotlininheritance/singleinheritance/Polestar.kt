package com.saket.kotlininheritance.singleinheritance

/**
 * Class inherits from abstract class, which in turn implements interface
 */
class Polestar : AbstractCar() {

    override var carType: CATEGORY = CATEGORY.SEDAN
    override var currentEngineState: IVehicle.ENGINE_STATE = IVehicle.ENGINE_STATE.OFF

    override var engineType: IVehicle.ENGINE = IVehicle.ENGINE.ELECTRIC

    override var modelName: String = "Polestar"

    override var noOfDoors: Int = 4

    /*
    Although AbstractCar has overridden this interface method from IVehicle
    we can override it here again
     */
    override fun startEngine() {
        //super instance here refers to AbstractCar. So i comment it because then it
        //prints AbstractCar's message before Polestar's message.
        //super.startEngine()
        println("Start Polestar engine..")
    }

    override fun stopEngine() {
        //super.stopEngine()
        println("Stop Polestar engine..")
    }
}