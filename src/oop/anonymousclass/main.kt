package oop.anonymousclass

fun main(args: Array<String>) {

    var programmer: Human = object : Human // creating an instance of the interface // anonymous

    {
        override fun think() { // overriding the think method
            print("This is an example of Anonymous Inner Class ")
        }
    }

   // programmer.think()
}


interface Human {
    fun think()
}