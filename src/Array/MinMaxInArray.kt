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

    print("Min and MAx only :")
    testCases.forEach{ it ->
        print("\n ${it.joinToString()}")
        findMinMax(it)
    }
    print("\nSecond Min and Second Max  :")
    testCases.forEach{ it ->
        print("\n ${it.joinToString()}")
        findSecMinMax(it)
    }

}

fun findMinMax(arr: IntArray){
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for(num in arr){
        if (num < min) min = num
        if (num > max) max = num
    }
    print(" Min : $min Max : $max")
}

fun findSecMinMax(arr: IntArray){

    var min = Int.MAX_VALUE
    var secMin = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var secMax = Int.MIN_VALUE

    for(num in arr){
        if(num > max){
            secMax = max
            max = num
        }else if(num > secMax && num < max)
        {
                secMax = num
        }

        if(num < min){
            secMin = min
            min = num
        }else if(num < secMin && num > min){
                secMin = num
        }
    }
    print(" Min : $min, SecMin : $secMin, Max : $max, SecMax : $secMax")
}

fun findMinMaxThird(arr: IntArray){

}