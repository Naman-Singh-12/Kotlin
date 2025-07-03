package Array

fun main(){
    print("Left rotate array by one place\n")
    val arr = arrayOf(3,5,1,7,5,9)
    leftRotateByOne(arr)
}

fun leftRotateByOne(arr: Array<Int>) {

    var first = arr[0]

    for(j in 0 until arr.size-1) {
        arr[j] = arr[j+1]
    }

    arr[arr.size -1] = first


    arr.forEach{
        print(" $it")
    }
}
