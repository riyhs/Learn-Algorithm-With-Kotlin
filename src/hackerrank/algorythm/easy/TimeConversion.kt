package hackerrank

import java.io.*
import java.math.*
import java.text.*
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val f = SimpleDateFormat("hh:mm:ssaa")
    val format = SimpleDateFormat("HH:mm:ss")

    val date = f.parse(s)

    return format.format(date)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
