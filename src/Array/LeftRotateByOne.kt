package Array

fun main(){
    print("Left rotate array by one place\n")
    val arr = arrayOf(3,5,1,7,5,9)
    leftRotateByOne(arr)
}

fun leftRotateByOne(arr: Array<Int>) {
    for(i in 0 until arr.size)
    {

        var d= arr[i]
        for(j in 0 until arr.size) {
            if ((j + 1) == arr.size) {
                break
            }
            arr[i + 1] = arr[i + 1] + arr[0]
            arr[0] = arr[i + 1] - arr[0]
            arr[i + 1] = arr[i + 1] - arr[0]
        }
    }


    arr.forEach{
        print(" $it")
    }
}
