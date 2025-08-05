package Array

fun main(){
    print("Find missing Number in Array\n")
    val testCases = arrayOf(
        intArrayOf(1, 2, 3, 5),               // Missing 4
        intArrayOf(2, 3, 4, 5),               // Missing 1
        intArrayOf(1, 2, 3, 4),               // Missing 5
        intArrayOf(1),                        // Missing 2
        intArrayOf(2),                        // Missing 1
        intArrayOf(5, 3, 1, 2),               // Missing 4
        intArrayOf(1, 3),                     // Missing 2
        intArrayOf(1, 2, 4, 5, 6, 7, 8, 9),   // Missing 3
        intArrayOf(9, 7, 6, 3, 2, 1, 4, 5),   // Missing 8
        intArrayOf(100000),                  // Edge case: single large element, missing 1
        intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11) // Missing 10
    )



    for (i in testCases){
    findMissingNumber(i)}

}


fun findMissingNumber(arr: IntArray) {

    var num = arr[0]
    for(i in 0 until arr.size){

        var isFind = false
        for(j in 0 until arr.size){
           if(num == arr[j]){
               isFind = true
               num++
               break
           }
        }

    }

    println("Missing number is : $num")

}
