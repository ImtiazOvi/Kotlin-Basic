package oop.constructor


// This is primary constructor
class ConstructorExample(var name: String, var age: Int) {

    // This is primary constructor body

}

// This is main method
fun main(args: Array<String>) {
    val constructorExample = ConstructorExample("Md Imtiaz Uddin", 25)
    println("First Name = ${constructorExample.name}")
    println("Age = ${constructorExample.age}")
}