package basic.variables


/**
 *** Strings ***
Strings are character arrays. Like Java, they are immutable in nature.
We have two kinds of string available in Kotlin - one is called raw String and another is called escaped String.
 * */

fun main(args: Array<String>) {
    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\n"

    println("Hello! $escapedString")
    println("Hey!! $rawString")
}