package Array

fun main() {
    println("Find Second largest Element in Array")
    val testInputs = listOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(5, 4, 3, 2, 1),
        arrayOf(10, 10, 9, 8, 7),
        arrayOf(7, 7, 7, 7),
        arrayOf(-1, -5, -2, -10),
        arrayOf(100),
        arrayOf(3, 3, 2, 2, 1),
        arrayOf(9, 1, 9, 8),
        arrayOf(2, 2),
        arrayOf(Int.MIN_VALUE, 0, Int.MAX_VALUE),
        arrayOf(45, 12, 89, 89, 34, 12),
        arrayOf(100, 50),
        arrayOf(0, 0, 0, 1),
        arrayOf(-10, -20, -30, -20, -10),
        arrayOf(1, 1, 1, 2)
    )

    for (i in testInputs.size until testInputs.size) {
        println("Second Largest Element is : ${findSecondLargestSec(testInputs[i])}")
    }


}

fun findSecondLargestSec(arr: Array<Int>): String {

    if (arr.size <= 1) {
        return "Inappropriate Input"
    }
    var firstLarge  = arr[0]
    var secondLarge  = arr[1]
    for(i in 0 until arr.size){
        arrayOf(45, 12, 89, 89, 34, 12)
        if(secondLarge > arr[i] && secondLarge < firstLarge){
        }else{
            if(secondLarge < arr[i]){
                if(firstLarge < arr[i])
                {
                    secondLarge  = firstLarge
                    firstLarge = arr[i]
                }
            }
        }
    }
    return secondLarge.toString()
}

fun findSecondLargest(arr: Array<Int>): String {

    if (arr.size <= 1) {
        return "Inappropriate Input"
    }

    for (i in 0 until arr.size) {
        for (j in 0 until arr.size) {
            if (i != j && arr[j] < arr[i]) {

                arr[j] = arr[j] + arr[i]
                arr[i] = arr[j] - arr[i]
                arr[j] = arr[j] - arr[i]

            }
        }

    }

    var isSame = arr[0]
    for(i in 1 until arr.size){
       if(arr[i] != isSame) return arr[i].toString()
    }

      return "---NON---"
}

