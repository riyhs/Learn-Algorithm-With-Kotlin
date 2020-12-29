fun main() {
    // masih salah
    val nums = intArrayOf(33,533,25,562,42,59)
    val sortedNums = doInsertionSort(nums)
    for (num in sortedNums) {
        print("$num ")
    }
}

fun doInsertionSort(arr: IntArray): IntArray {
    var sorted = 0
    for(i in sorted until arr.size) {
        val temp = arr[i]

        for (j in sorted downTo 0) {
            if (arr[j] > temp) {
                arr[j+1] = arr[j]
                arr[j] = temp
            } else {
                break
            }
        }
        sorted++
    }

    return arr
}
