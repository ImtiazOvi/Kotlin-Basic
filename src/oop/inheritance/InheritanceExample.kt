package oop.inheritance


/**
 * Everything in Kotlin is by default final, hence, we need to use the keyword “open”
 *in front of the class declaration to make it allowable to inherit.
*/

open class Any{
    var myName: String = "My name is Md Imtiaz uddin ovi"
}

class Another: Any() { // inheritance with default constructor

}

fun main(){
    var obj = Another()
    print(obj.myName)
}