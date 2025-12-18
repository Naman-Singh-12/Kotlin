package Old.Array

fun main(){

    print("Left Rotate array by random place\n")
    val arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    leftRotateByRandomNative(arr, 4)
}

fun leftRotateByRandomNative(arr: Array<Int>, n: Int) {

    val size = arr.size
    val rotateBy = n % size  // to handle n > size
    val rotateArray = Array(rotateBy) { 0 }

    // Step 1: Backup first 'rotateBy' elements
    for (i in 0 until rotateBy) {
        rotateArray[i] = arr[i]
    }

    // Step 2: Shift elements left by 'rotateBy' places
    for (i in 0 until size - rotateBy) {
        arr[i] = arr[i + rotateBy]
    }

    // Step 3: Add backup elements to the end
    for (i in 0 until rotateBy) {
        arr[size - rotateBy + i] = rotateArray[i]
    }

    for(a in arr){
        print(" $a")
    }

}

fun leftRotateByRandom(arr: Array<Int>, n: Int) {
    val size = arr.size
    val rotateBy = n % size  // in case n > size

    // Backup first 'rotateBy' elements
    val temp = arr.sliceArray(0 until rotateBy)

    // Shift remaining elements to the left
    for (i in 0 until size - rotateBy) {
        arr[i] = arr[i + rotateBy]
    }

    // Place the backed-up elements at the end
    for (i in 0 until rotateBy) {
        arr[size - rotateBy + i] = temp[i]
    }

    // Print result
    for (value in arr) {
        print(" $value")
    }
}
