fun main() {
    val array = intArrayOf(3,4,6,2,5,7,8,1,48,2923,428,32)
    val sortedArray = doBubbleSort(array)
    for (i in sortedArray) {
        print("$i ")
    }
}

fun doBubbleSort(arr: IntArray): IntArray {
    var swap = true
    while (swap) {
        swap = false

        for (i in arr.indices) {
            if (i < arr.size-1 && arr[i] > arr[i+1]) {
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp

                swap = true
            }
        }
    }
    return arr
}