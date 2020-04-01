package oop.visibilityoraccessmodifires

open class PrivateModifier {
    private val i = 1
}


class Another: PrivateModifier(){
    var  obj = Another()
    // obj.   // cannot access
}