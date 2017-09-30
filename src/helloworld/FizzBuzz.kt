package helloworld

fun main(args: Array<String>) {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(num: Int) : Any{
    return when {
        num % 3 == 0 && num % 5 == 0 -> "FizzBuzz"
        num % 3 == 0 -> "Fizz"
        num % 5 == 0 -> "Buzz"
        else -> num
    }
}