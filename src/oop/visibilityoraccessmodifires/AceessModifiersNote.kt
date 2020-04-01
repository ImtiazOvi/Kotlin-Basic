package oop.visibilityoraccessmodifires

// There are 4 access  modifiers available in Kotlin.
// 1. private 2. protected 3. internal 4. public

/*
// private : classes, methods, and packages can be declared with a private modifier
Once anything is declared as private, then it will be accessible within its immediate scope.
For instance, a private package can be accessible within that specific file.
 A private class or interface can be accessible only by its data members.
 */

/*
* protected: not available for top level declaration like any package cannot be protected.
* A protected class or interface is visible to its subclass only.
* */

/*
* internal :  If anything is marked as internal, then that specific field will be in the internal field.
* An Internal package is visible only inside the module under which it is implemented.
* An internal class interface is visible only by other class present inside the same package or the module.
* */


/*
* public : Public modifier is accessible from anywhere in the project workspace.
*  If no access modifier is specified, then by default it will be in the public scope.
* */