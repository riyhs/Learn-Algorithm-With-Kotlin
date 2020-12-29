package soal

import java.util.*

fun main() {
    var n = 0

    val input = Scanner(System.`in`)
    var c = input.next()

    while (c != ".") {
        if (c.length > 1) n += c.length
        else n++

        c = input.next()
    }

    println(n)
}