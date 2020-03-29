package basic.`when`

/**
 * As like other languages Switch case
 * */
fun main(args: Array<String>) {
    val x:Int = 5
    when (x) {
        1 -> print("x = = 1")
        2 -> print("x = = 2")
        //5 -> print("x==5")

        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}