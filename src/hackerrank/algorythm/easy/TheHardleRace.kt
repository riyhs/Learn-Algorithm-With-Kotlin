package hackerrank.algorythm.easy

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    var highest = 0

    for (hurdle in height) {
        if (hurdle > highest) {
            highest = hurdle
        }
    }

    return if (highest > k) highest - k else 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
