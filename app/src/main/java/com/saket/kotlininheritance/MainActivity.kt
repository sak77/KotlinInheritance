package com.saket.kotlininheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saket.kotlininheritance.singleinheritance.AbstractCar
import com.saket.kotlininheritance.singleinheritance.Polestar
import com.saket.kotlininheritance.singleinheritance.VolvoXC40

/**
 * This sample code looks at different possibilities for inheritance in Kotlin.
 * Interface can have default methods or abstract methods
 * Interface can have abstract properties
 * Interface can have properteis with accessors but cannot use backing field in them
 * Interface cannot store state value
 *
 * Interface can inherit from multiple other interfaces.
 *
 * Abstract class does not have to implement all methods from its super interface
 * Abstract class can also have some abstract methods
 *
 * Classes only support single inheritance
 * super keyword in class refers to its direct parent's implementation
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testMultipleInheritance()
    }

    fun testWithCars() {
        //Demonstrating Liskov substitution.
        val myVolvoXC40: AbstractCar = VolvoXC40()
        myVolvoXC40.startEngine()

        val myPolestar: AbstractCar = Polestar()
        myPolestar.startEngine()

        if (myVolvoXC40.isEngineOn()) {
            myVolvoXC40.stopEngine()
        }

        if (myPolestar.isEngineOn()) {
            myPolestar.stopEngine()
        }
    }

    fun testMultipleInheritance() {
        val myD = D()

        myD.doSomething()
        myD.doSomethingAgain()

        val myFirst: IFirst = D()
        myFirst.doSomething()

        val mySecond: ISecond = D()
        mySecond.doSomething()
        mySecond.doSomethingAgain()
    }
}

/*
Multiple inheritance is not supported for classes. Only for interface.

Below class C cannot have 2 supertypes (A and B).
 */
open class A {
    fun doSomething() {
    }
}

open class B {
    fun doSomething() {
    }
}

class C : A()

/*
Kotlin supports multiple inheritance for interface.

Interface can have its own default implementation.
Like doSomething() below.

Otherwise method without body is treated as an abstract method.
 */
interface IFirst {
    fun doSomething() {
        println("IFirst do Something")
    }
}

interface ISecond {
    fun doSomething() {
        println("ISeconds do Something")
    }
    fun doSomethingAgain()
}

class D : IFirst, ISecond {

    override fun doSomething() {
        //To invoke the interface's implementation of doSomething(), use super keyword.
        super<IFirst>.doSomething()
        super<ISecond>.doSomething()
        println("Override doSomething() ")
    }

    override fun doSomethingAgain() {
        println("Override doSomethingAgain() from ISecond interface.")
    }
}