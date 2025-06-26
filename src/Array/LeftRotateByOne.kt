package Array

fun main(){
    print("Left rotate array by one place\n")
    val arr = arrayOf(3,5,1,7,5,9)
    leftRotateByOne(arr)
}

fun leftRotateByOne(arr: Array<Int>) {
    arr[arr.size-1] = arr[arr.size-1] + arr[0]
    arr[0] = arr[arr.size-1] - arr[0]
    arr[arr.size-1] = arr[arr.size-1] - arr[0]

    arr.forEach{
        print(" $it")
    }
}
