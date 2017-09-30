package learning

fun main(args: Array<String>) {
    val num: Int = 69
    val num2: Int = 92
    println("Square of ${num} = ${square(num)}")
    println("Max between ${num} and ${num2} = ${max(num, num2)}")
    println("$num is even? ${isEven(num)}")
    println("$num2 is even? ${isEven(num2)}")
    println("Factorial of 10 = ${factorial(10)}")
    println("Fibonacci of 4 = ${fib(4)}")


}

fun square(num: Int): Int = num * num

fun max(x: Int, y: Int): Int = if (x > y) x else y

fun isEven(num: Int): Boolean = num % 2 == 0

fun factorial(num: Int): Int {
    var total: Int = 1
    for (i in 1..num) {
        total *= i
    }
    return total
}

fun fib(num: Int): Int {
    return when {
        num < 0 -> -1
        num == 0 -> 1
        num == 1 -> 1
        else -> fib(num - 1) + fib(num - 2)
    }
}