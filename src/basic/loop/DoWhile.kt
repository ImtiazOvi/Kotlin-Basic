package basic.loop

fun main(args: Array<String>) {
    var x:Int = 0
    do {
        x += 10  // x = x + 10
        println("I am inside Do block---$x")
    } while(x <= 50)
}