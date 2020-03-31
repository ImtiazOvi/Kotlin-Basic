package oop


// Class
class KotlinClass {

    // property (data member)
    private var name: String = "Imtiaz Ovi"

    // member function
    fun printMe() {
        print("My name is-$name")
    }
}

// ===== Main method ======//
fun main(args: Array<String>) {
    val obj = KotlinClass() // create obj object of myClass class
    obj.printMe()
}