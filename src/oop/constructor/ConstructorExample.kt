package oop.constructor




fun main(args: Array<String>) {
    val constructorExample = ConstructorExample("Md Imtiaz Uddin", 25)
    println("First Name = ${constructorExample.name}")
    println("Age = ${constructorExample.age}")
}

// This is primary constructor
class ConstructorExample( var name:String, var age:Int) {

    // This is primary constructor body

}