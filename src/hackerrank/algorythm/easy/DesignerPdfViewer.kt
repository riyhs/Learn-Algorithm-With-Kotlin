package hackerrank.algorythm.easy

import java.util.*

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    var highest = 0

    for (char in word) {
        if (h[char.toInt() - 97] > highest) highest = h[char.toInt() - 97]
    }

    return word.length * highest
}

// Link Problem
// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val word = scan.nextLine()

    val result = designerPdfViewer(h, word)

    println(result)
}
