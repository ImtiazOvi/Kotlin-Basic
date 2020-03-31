package oop


fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // calling nested class method
    print(demo)
}

class Outer {
    class Nested {

        fun foo() = "Every night in my dream"

    }
}