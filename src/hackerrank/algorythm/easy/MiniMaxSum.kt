package hackerrank

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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Long>): Unit {
    var min: Long = 0
    var max: Long = 0

    val sortedArr = arr.sortedArray()

    for (num in sortedArr) {
        min += num
    }

    for (num in sortedArr) {
        max += num
    }

    println("${min - sortedArr[sortedArr.size-1]} ${max - sortedArr[0]}")
}

// Link Problem
// https://www.hackerrank.com/challenges/mini-max-sum

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    miniMaxSum(arr)
}
