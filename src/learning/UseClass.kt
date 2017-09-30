package learning

class IntPair(val first: Int, val second: Int) {
    fun sum() : Int = first + second
    fun max(): Int = if (first > second) first else second
    fun swap(): IntPair = IntPair(second, first)
}

fun main(args: Array<String>) {
    val ip: IntPair = IntPair(3, 5)
    println("Sum : ${ip.sum()}") // => 8
    println("Max : ${ip.max()}") // => 5
    println("Swap : ${ip.swap().first}, ${ip.swap().second}") // => 5,3

}

