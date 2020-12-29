package soal

import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    val nAyam = input.nextInt()

    println("Anak ayam turun $nAyam")

    for (i in nAyam downTo 2) {
        println("Anak ayam turun $i, mati satu tinggal ${i - 1}")
    }

    println("Anak ayam turun 1, mati satu tinggal induknya")
}