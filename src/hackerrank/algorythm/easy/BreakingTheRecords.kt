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
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var minimum = scores[0]
    var maximum = scores[0]
    var min = 0
    var max = 0

    for (score in scores) {
        when{
            score < minimum -> {
                minimum = score
                min++
            }
            score > maximum -> {
                maximum = score
                max++
            }
        }
    }

    return arrayOf(max, min)
}

// Link Problem
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
