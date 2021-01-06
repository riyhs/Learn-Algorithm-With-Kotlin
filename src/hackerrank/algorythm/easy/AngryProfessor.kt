package hackerrank.algorythm.easy


import java.util.*

// Complete the angryProfessor function below.
fun angryProfessor(k: Int, att: Array<Int>): String {
    var n = 0

    for (a in att) {
        if (a <= 0) n++
    }

    return if (n >= k) "NO" else "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()

        val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}

