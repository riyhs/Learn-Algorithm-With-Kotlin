package hackerrank.algorythm.easy

import hackerrank.plusMinus
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
import java.util.Arrays

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var temp = 0
    var total = 0
    for (i in s.indices) {

        if (i == s.size - m + 1) break

        for (j in i until i + m) {
            temp += s[j]
        }

        if (temp == d) total++

        temp = 0
    }

    return total
}

// Link Problem
// https://www.hackerrank.com/challenges/the-birthday-bar/problem

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
