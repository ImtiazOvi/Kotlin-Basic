package oop.constructor

/**
 * Any number of secondary constructors can be created,
 * however, all of those constructors should call the primary constructor directly or indirectly.
 * **/



// Class
class SecondaryConstructorExample(val firstName: String, var age: Int) {

    val message: String = "Hello!"

    // Secondary constructor
    constructor(name: String, age: Int, message: String) : this(name, age) {
    }
}


// This is main method
fun main(args: Array<String>) {
    val person = SecondaryConstructorExample("Imtiaz Uddin Ovi", 25)
    print("${person.message}" + "${person.firstName}" + "This is secondary constructor, Your Age is-${person.age}"
    )
}