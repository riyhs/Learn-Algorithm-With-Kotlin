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

// Complete the commonChild function below.
fun commonChild(s1: String, s2: String): Int {
    val commonChild = mutableListOf<Char>()

    for (a in s1) {
        for (b in s2) {
            if (a == b) {
                if (!commonChild.contains(a)) {
                    commonChild.add(a)
                }
            }
        }
    }

    return commonChild.size
}

// NOT SOLVED YET

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s1 = scan.nextLine()

    val s2 = scan.nextLine()

    val result = commonChild(s1, s2)

    println(result)
}