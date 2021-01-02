package hackerrank.algorythm.easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.text.*

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var a = 0
    var b = 0

    for (i in arr.indices) {
        a += arr[i][i]
    }

    for ((i, j) in (arr.size-1 downTo 0).withIndex()) {
        b += arr[i][j]
    }

    return abs(a-b)
}

// Link Problem
// https://www.hackerrank.com/challenges/diagonal-difference

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
