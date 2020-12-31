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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var nPlus = 0
    var nMinus = 0
    var nZero = 0
    for (i in arr.indices) {
        when {
            arr[i] >= 1 -> nPlus++
            arr[i] <= -1 -> nMinus++
            else -> nZero++
        }
    }
    println(nPlus.toFloat() / arr.size.toFloat())
    println(nMinus.toFloat() / arr.size.toFloat())
    println(nZero.toFloat() / arr.size.toFloat())
}

// Link Problem
// https://www.hackerrank.com/challenges/plus-minus

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
