package Array

fun main(){

    val testCases = arrayOf(
        // --- Basic ---
        intArrayOf(1, 2, 3, 4, 5),                 // [5, 4, 3, 2, 1]  (odd length)
        intArrayOf(1, 2, 3, 4),                    // [4, 3, 2, 1]     (even length)

        // --- Single element ---
        intArrayOf(7),                             // [7]
        intArrayOf(0),                             // [0]

        // --- Two elements ---
        intArrayOf(1, 2),                          // [2, 1]
        intArrayOf(2, 1),                          // [1, 2]

        // --- Three elements (middle element must stay) ---
        intArrayOf(1, 2, 3),                       // [3, 2, 1]

        // --- All equal ---
        intArrayOf(5, 5, 5, 5),                    // [5, 5, 5, 5]

        // --- Palindromic array (reverse equals original) ---
        intArrayOf(1, 2, 3, 2, 1),                 // [1, 2, 3, 2, 1]

        // --- Negatives and mixed signs ---
        intArrayOf(-1, -2, -3),                    // [-3, -2, -1]
        intArrayOf(-5, 0, 5, 10),                  // [10, 5, 0, -5]

        // --- Duplicates in different positions ---
        intArrayOf(1, 2, 2, 3, 1),                 // [1, 3, 2, 2, 1]

        // --- Extreme values ---
        intArrayOf(Int.MAX_VALUE, Int.MIN_VALUE),  // [-2147483648, 2147483647]
        intArrayOf(1_000_000_000, 0, -1_000_000_000), // [-1000000000, 0, 1000000000]

        // --- Already sorted / reverse sorted ---
        intArrayOf(1, 2, 3, 4, 5, 6),              // [6, 5, 4, 3, 2, 1]
        intArrayOf(6, 5, 4, 3, 2, 1),              // [1, 2, 3, 4, 5, 6]

        // --- Empty array (must not crash) ---
        intArrayOf(),                              // []

        // --- Large input (performance) ---
        /*IntArray(100_000) { it },                  // first = 99999, last = 0
        IntArray(100_000) { 100_000 - it }         // first = 1, last = 100000*/
    )

    for(i in testCases) {
        reverseArray(i)
    }
}

fun reverseArray(arr: IntArray){

    if(arr == null || arr.isEmpty()) {
        print("Array is Empty")
        return
    }

    val arrSize = arr.size / 2
    for(i in 0 until arrSize-1) {
        arr[i] = arr[arr.size - 1 - i] + arr[i]
        arr[arr.size - 1 - i] = arr[i] - arr[arr.size - 1 - i]
        arr[i] = arr[i] - arr[arr.size - 1 - i]
    }

    for(i in arr){
        print("$i ")
    }
    println()
}