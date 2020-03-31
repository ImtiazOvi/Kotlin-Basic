package oop

fun main(args: Array<String>) {
    val demo = InnerClass().Nested().foo() // calling nested class method
    print(demo)
}

class InnerClass {
    private val welcomeMessage: String = "Hello is it me"

    inner class Nested {
        fun foo() = welcomeMessage
    }
}
