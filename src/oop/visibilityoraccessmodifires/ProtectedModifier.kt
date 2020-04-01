package oop.visibilityoraccessmodifires

open class ProtectedModifier {
    protected val i = 1
}


class B : ProtectedModifier() {
    fun getValue(): Int {
        return i
    }
}