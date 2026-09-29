package Array

fun main(){

    val testCases = arrayOf(
        // --- Basic ---
        intArrayOf(3, 5, 1, 9, 2),                 // max = 9, min = 1
        intArrayOf(10, -3, 0, 25, -8, 14),         // max = 25, min = -8

        // --- Single element ---
        intArrayOf(7),                             // max = 7, min = 7
        intArrayOf(0),                             // max = 0, min = 0
        intArrayOf(-5),                            // max = -5, min = -5

        // --- Two elements ---
        intArrayOf(1, 2),                          // max = 2, min = 1
        intArrayOf(2, 1),                          // max = 2, min = 1

        // --- All equal ---
        intArrayOf(5, 5, 5, 5),                    // max = 5, min = 5
        intArrayOf(0, 0, 0),                       // max = 0, min = 0

        // --- All negative ---
        intArrayOf(-4, -10, -1, -7),               // max = -1, min = -10

        // --- Already sorted / reverse sorted ---
        intArrayOf(1, 2, 3, 4, 5),                 // max = 5, min = 1
        intArrayOf(5, 4, 3, 2, 1),                 // max = 5, min = 1

        // --- Max / min at the boundaries ---
        intArrayOf(9, 1, 2, 3),                    // max at first (9), min = 1
        intArrayOf(1, 2, 3, 9),                    // max at last (9), min = 1
        intArrayOf(0, 5, 7, 3),                    // min at first (0), max = 7
        intArrayOf(5, 7, 3, 0),                    // min at last (0), max = 7

        // --- Duplicates of max and min ---
        intArrayOf(9, 1, 9, 1, 5),                 // max = 9, min = 1

        // --- Extreme values (overflow / bad initialization traps) ---
        intArrayOf(Int.MAX_VALUE),                 // max = 2147483647, min = 2147483647
        intArrayOf(Int.MIN_VALUE),                 // max = -2147483648, min = -2147483648
        intArrayOf(Int.MAX_VALUE, Int.MIN_VALUE),  // max = 2147483647, min = -2147483648
        intArrayOf(1_000_000_000, -1_000_000_000), // max = 1000000000, min = -1000000000

        // --- Mixed sign ---
        intArrayOf(-1, 0, 1),                      // max = 1, min = -1

        // --- Empty array (decide how you handle this) ---
        intArrayOf(),                              // null / exception / your choice

        // --- Large input (performance) ---
        IntArray(100_000) { it },                  // max = 99999, min = 0
        IntArray(100_000) { 100_000 - it }         // max = 100000, min = 1
    )

    for(i in testCases){showMinMax(i)}
}

fun showMinMax(intArray: IntArray){

    if(intArray.isEmpty())
    {
        println("Array is Empty")
        return
    }
    var minNum = intArray[0]
    var maxNum = intArray[0]
    for(i in intArray){
        if(i <  minNum){
            minNum = i
        }else if(i > maxNum){
            maxNum = i
        }
    }
    println("Min Num :"+minNum+" Max Num :"+maxNum)
}