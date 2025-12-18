package Old.Array

fun main() {

    val arr = arrayOf(9,4,8,4,7,3,9,8)
    findMinMaxElement(arr)
    findMinMaxElementByCollection(arr)
}

fun findMinMaxElementByCollection(arr: Array<Int>) {

}

fun findMinMaxElement(arr: Array<Int>) {

    var min = arr[0]
    var max = arr[0]

    for(i in arr){

        if(i < min){
            min = i
        }else if(i > max){
            max = i
        }
    }

    println("Min : $min, Max : $max")

}
