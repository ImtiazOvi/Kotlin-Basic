package basic.controlflow

fun main(args: Array<String>) {
    println("Example of Break and Continue")
     for(x in 1..10) { // appling the custom label
        if(x == 5) {
            println("I am inside if block with value$x -- hence it will close the operation")
            break // spacing the label
        } else {
            println("I am inside else block with value$x")
            continue
        }
    }
}