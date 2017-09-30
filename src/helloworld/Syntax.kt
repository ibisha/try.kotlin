package helloworld

fun main(args: Array<String>) {
    // 基本
    println(1 + 2)
    println("hi".toUpperCase())

    // オブジェクト
    val userName: String = "Tom"
    val userAge: Int = 19
    println("${userName}は${userAge}です")

    // if
    var age = 29
    if (age > 20) {
        println("成人")
    } else {
        println("未成年")
    }

    // for
    val names = listOf("foo", "bar", "hoge")
    for (name in names) {
        println(name)
    }

    // 代入
    val nums = listOf(1, 2, 4)
    var sum = 0
    for (n in nums) {
        sum += n
    }
    println(sum)

    // when式
    val word = "one"
    val num = when(word) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        else -> -1
    }
    println(num)

    // when応用
    println(result(90))


}

fun result(score: Int): String {
    return when {
        80 <= score && score <= 100 -> "Great"
        50 <= score && score < 80 -> "Good"
        else -> "Reject"
    }
}