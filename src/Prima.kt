fun main() {
    checkIsPrima(821)
    checkIsPrima(659)
}

fun checkIsPrima(num : Int) {
    var isPrima = true

    for (i in (num - 1) downTo 2) {
        if (num % i == 0) {
            isPrima = false
        }
    }

    if (num > 1 && isPrima) {
        println("Prima")
    } else {
        println("Bukan Prima")
    }
}

