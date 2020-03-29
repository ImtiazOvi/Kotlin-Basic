package basic.loop

fun main(args: Array<String>) {
    val items = listOf(1, 22, 83, 4)

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}