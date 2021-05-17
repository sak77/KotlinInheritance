package com.saket.kotlininheritance.singleinheritance

/**
 * Class inherits from abstract class, which in turn implements interface
 */
class VolvoXC40 : AbstractCar() {

    override var carType: CATEGORY = CATEGORY.SUV

    override var engineType: IVehicle.ENGINE = IVehicle.ENGINE.COMBUSTION

    override var modelName: String = "Volvo XC40"

    override var noOfDoors: Int = 4

    override var currentEngineState: IVehicle.ENGINE_STATE = IVehicle.ENGINE_STATE.OFF

    /*
    Although AbstractCar has overridden this interface method from IVehicle
    we can override it here again
    */
    override fun startEngine() {
        //super instance here refers to AbstractCar. So i comment it because then it
        //prints AbstractCar's message before VolvoXC40 message.
        //super.startEngine()
        println("Starting Volvo XC40")
    }

    override fun stopEngine() {
        //super.stopEngine()
        println("Stopping Volvo XC40")
    }

}