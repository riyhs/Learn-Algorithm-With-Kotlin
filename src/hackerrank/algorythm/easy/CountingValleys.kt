package hackerrank.algorythm.easy

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    var passed = 0
    var currentPos = 0

    for (step in path) {
        when (step) {
            'U' -> currentPos++
            'D' -> currentPos--
        }

        if (currentPos == 0 && step == 'U') passed++
    }

    return passed
}

// Link Problem
// https://www.hackerrank.com/challenges/counting-valleys/problem

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
