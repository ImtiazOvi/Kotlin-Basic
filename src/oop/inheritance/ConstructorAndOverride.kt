package oop.inheritance

open class MyClass {
    open fun smile() { // If allow child class extend this method , method must be open
        print("Do you like smiling?")
    }
}

class OthersClass : MyClass() { // inheritance
    override fun smile() { // method override
        print("Yes i do")
    }
}

fun main() {
    var obj = OthersClass()
    obj.smile()

}