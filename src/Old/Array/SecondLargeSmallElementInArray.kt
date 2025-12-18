package Old.Array

fun main() {
    var arr = arrayOf(3, 6, 1, 8, 5, 0)
    findSecondValue(arr)
    findSecondValueSec(arr)
}

fun findSecondValueSec(arr: Array<Int>) {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE

}

fun findSecondValue(arr: Array<Int>) {

    for(i in 0 until arr.size){
        for(j in i+1 until arr.size){
            if(arr[i] > arr[j]){
                arr[i] = arr[j] + arr[i]
                arr[j] = arr[i] - arr[j]
                arr[i] = arr[i] - arr[j]
            }
        }
    }

    for(i in arr){
        print(" $i")
    }
    println("\nSecond Largest Element is : ${arr[arr.size-2]}")
    println("Second Smallest Element is : ${arr[1]}")
}

