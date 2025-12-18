package Old.Array

fun main() {

    print("Sorted Old.Array\n")
    var arr = arrayOf(3, 5, 1, 6, 8, 23, 8)
    arraySort(arr)
}

fun arraySort(arr: Array<Int>) {
    for (i in arr.indices) {
        for (j in i+1  until arr.size) {
            if (arr[i] < arr[j]) {
                arr[i] = arr[i] + arr[j]
                arr[j] = arr[i] - arr[j]
                arr[i] = arr[i] - arr[j]
            }
        }
    }
    arr.forEach{
        print(" $it")
    }
}
