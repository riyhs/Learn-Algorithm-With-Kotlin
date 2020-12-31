package hackerrank.algorythm.easy

import java.util.*
import kotlin.math.abs

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val a = abs(x - z)
    val b = abs(y - z)
    return when {
        a < b -> "Cat A"
        a > b -> "Cat B"
        else -> "Mouse C"
    }
}

// Link Problem
// https://www.hackerrank.com/challenges/cats-and-a-mouse

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
