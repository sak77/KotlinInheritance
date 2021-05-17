package com.saket.kotlininheritance.multipleinheritance

/**
 * Movement is one of the basic requirements for all animals.
 */
interface IMove {

    enum class MOVEMENT_MODES {
        TWO_LEGGED, FOUR_LEGGED, SWIM, CRAWL, CLIMB
    }
}