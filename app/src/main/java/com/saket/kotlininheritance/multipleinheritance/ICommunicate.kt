package com.saket.kotlininheritance.multipleinheritance

/**
 * One of the basic needs of all animals is to communicate.
 */
interface ICommunicate {

    enum class COMMUNICATION_MODES {
        VERBAL, NONVERBAL, WRITTEN
    }

    var communicationModes: List<COMMUNICATION_MODES>

    fun talk()

    fun listen()
}