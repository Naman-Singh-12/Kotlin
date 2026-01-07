package Array

fun main(){
    val testCases: List<IntArray> = listOf(

        // Basic cases
        intArrayOf(1, 2, 3, 4, 5),
        intArrayOf(5, 4, 3, 2, 1),
        intArrayOf(10, 10, 10, 10),

        // Mixed positive & negative
        intArrayOf(-1, -2, -3, -4),
        intArrayOf(-10, 0, 5, -3, 8),
        intArrayOf(3, -7, 2, -9, 4, 0),

        // Edge cases
        intArrayOf(5),
        intArrayOf(0),
        intArrayOf(-100),

        // Large values
        intArrayOf(Int.MAX_VALUE, 0, Int.MIN_VALUE),
        intArrayOf(999999, 123456, 987654, -999999),

        // Duplicates
        intArrayOf(2, 2, 2, 3, 3, 1, 1),
        intArrayOf(7, 7, 7, 7, 7),

        // Random order
        intArrayOf(12, 45, 7, 89, 23, 56, 1),
        intArrayOf(34, -12, 0, 89, -45, 67, 2),

        // Interview trap cases
        intArrayOf(100, -100),
        intArrayOf(0, 0, 0, 0),
        intArrayOf(-1, 1),

        // Stress / robustness
        intArrayOf(5, -2, 5, -2, 5, -2),
        intArrayOf(1, -1, 1, -1, 1, -1)
    )

    testCases.forEach {
        print(it.joinToString())
        reverseArray(it)
    }
}

fun reverseArray(arr: IntArray){
    for(i in 0 until arr.size/2){

        var temp = arr[i]
        arr[i] = arr[arr.size -1-i]
        arr[arr.size-1-i] = temp

    }
    print(" > Reverse : ${arr.joinToString()}\n")
}