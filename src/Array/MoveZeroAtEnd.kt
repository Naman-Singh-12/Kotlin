package Array

fun main(){
    println("Move all zero at the end.")
    val testInputs = listOf(
        intArrayOf(),                         // Empty array
        intArrayOf(0),                        // Single zero
        intArrayOf(5),                        // Single non-zero
        intArrayOf(1, 2, 0),                  // Zero at the end
        intArrayOf(0, 1, 0, 2, 0, 3),         // Multiple zeros
        intArrayOf(5, 6, 7),                  // No zeros
        intArrayOf(0, 0, 0),                  // All zeros
        intArrayOf(1, 0, 2),                  // Zero at second last position
        intArrayOf(0, 5, 6, 0),               // Zero at start and end
        intArrayOf(0, 1, 0, 2, 3, 0, 4, 0, 5, 0, 6) // Longer mixed array
    )
    for(test in testInputs) {
        //moveZeroAtEnd(test)
        //moveZeroWithOptimise(test)
        byCollection(test)
    }
}

fun moveZeroWithOptimise(test: IntArray) {
    var pos = 0
    for(i in 0 until test.size){
        if(test[i] != 0){
            test[pos] = test[i]
            pos++
        }
    }

    while(pos < test.size)
    {
        test[pos] = 0
        pos++
    }
    for(i in test){
        print(" $i")
    }
    println("")
}

fun moveZeroAtEnd(arr: IntArray){

    for(i in 0 until arr.size){
        for(j in 0 until arr.size) {
            if (arr[j] == 0 && j + 1 != arr.size) {
                if(arr[j+1] == 0 ){
                    continue
                }
                var temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    for(i in arr){
        print(" $i")
    }
    println("")
}

fun byCollection(arr: IntArray){

   val nonZero = arr.filter { it != 0 }
    val zeroCount =  arr.size - nonZero.size
    val result = nonZero + List(zeroCount){0}
    for(i in result){
        print(" $i")
    }
    println("")
}