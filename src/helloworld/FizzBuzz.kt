package helloworld

fun main(args: Array<String>) {
    for (i in 1..100) {
        fizzBuzz(i)
    }
}

fun fizzBuzz(num: Int) {
    when {
        num % 3 == 0 && num % 5 == 0 -> println("FizzBuzz")
        num % 3 == 0 -> println("Fizz")
        num % 5 == 0 -> println("Buzz")
        else -> println(num)
    }
}