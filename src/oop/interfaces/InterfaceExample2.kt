package oop.interfaces

/**
 * Kotlin does not support multiple inheritances.
 * The same thing can be achieved by implementing more than two interfaces at a time.
 * */


// Interface may have no constructor

interface One{

    fun printOne(){
        println("I am One")
    }
}
interface Two{
    fun printTwo(){
        println("I am Two")
    }
}


// implements two interfaces
class InterfaceExample2 : One , Two

fun main(){
    val obj = InterfaceExample2()
    obj.printOne()
    obj.printTwo()
}

