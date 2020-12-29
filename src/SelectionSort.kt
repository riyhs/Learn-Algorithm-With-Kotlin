fun main() {
    val nums = intArrayOf(1,9,3,8,4,5,7,6,0,-129,92,48,38,92,49,2861)
    val sortedNums = doSelectionSort(nums)
    for (num in sortedNums) {
        print("$num ")
    }
}

fun doSelectionSort(arr: IntArray): IntArray {
    for (i in arr.indices) {
        var minimum = arr[i]
        var indexOfMin = i

        for (j in i until arr.size){
            if (arr[j] < minimum) {
                minimum = arr[j]
                indexOfMin = j
            }
        }
        arr[indexOfMin] = arr[i]
        arr[i] = minimum
    }

    return arr
}
