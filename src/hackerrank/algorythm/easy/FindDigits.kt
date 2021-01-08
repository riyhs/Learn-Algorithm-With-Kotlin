package hackerrank.algorythm.easy

import java.util.*

fun findDigits(n: Int): Int {
    // With Convert To String

    val a = n.toString()
    var total = 0

    for (i in a) {
        if (i.toInt() - 48 != 0 && n % (i.toInt() - 48) == 0) total++
    }

    return total
}

fun findDigits2(n: Int): Int {
    // Without Convert to String

    var a = n
    var total = 0

    while (a > 0) {
        if (a % 10 != 0 && n % (a % 10) == 0) total++
        a /= 10
    }

    return total
}

// Link Problem
// https://www.hackerrank.com/challenges/find-digits/problem

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = findDigits2(n)

        println(result)
    }
}
