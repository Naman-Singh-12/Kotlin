package Array

fun main(){
    println("Array : Remove Duplicate")
    removeDuplicateUnSorted(intArrayOf(1,2,2,4,5,6,6))
}

fun removeDuplicateSorted(arr: IntArray){


    var index = 0
    for(i in 1 until arr.size){
        if(arr[i] == arr[index]){

            arr[i] = 0
        }
        index++
    }
    for(num in arr){
        if(num!=0)print(" $num")
    }

}

fun removeDuplicateUnSorted(arr: IntArray){


}