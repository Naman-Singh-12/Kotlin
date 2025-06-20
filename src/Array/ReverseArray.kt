package Array

fun main(){

    print("Print reverse array")
    var arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    printReverseArray(arr)
}

fun printReverseArray(arr: Array<Int>) {

    for(i in arr.size  downTo 1){
        print("  $i")
    }
}
