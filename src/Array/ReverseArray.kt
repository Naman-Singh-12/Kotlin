package Array

fun main(){
    println("Enter your age: ")
    reverseArray(arrayOf(1,2,3,4,5,6))
}

fun reverseArray(arr: Array<Int>){
    if(arr.isEmpty())
    {
        print(" All elements must be non-empty")
        return
    }
    for(index in arr.indices.reversed()){
        print(" "+arr[index])
    }
}