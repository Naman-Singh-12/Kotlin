package Array

fun main(){
    println("Duplicated form sorted array")
    val arr = arrayOf(6,2,9,3,6,2,9,2,5)
    //removeDuplicate(arr)
    removeDuplicateByCollection(arr)
}

fun removeDuplicateByCollection(arr: Array<Int>) {
    val arr2 = arr.sorted().toSet()
    arr2.forEach{
        print(" $it")
    }

}

fun removeDuplicate(arr: Array<Int>) {

    for(i in 0 until arr.size){
        for(j in i+1 until arr.size){
            if(arr[i] > arr[j]){
                arr[i] = arr[j]+arr[i]
                arr[j] = arr[i]-arr[j]
                arr[i] = arr[i] - arr[j]
            }
        }
    }

   /* for(i in 0..arr.lastIndex){
       for(j in i+1 until arr.size){
           if(arr[i] == arr[j]){
              arr[j] = 0
           }else{
               break
           }
       }
    }
    val result = arr.filter{
        it != 0
    }
    result.forEach{
        print(" $it")
    }*/

    // Step 2: Apply sorted duplicate removal
    var index = 0
    for (i in 1 until arr.size) {
        if (arr[i] != arr[index]) {
            index++
            arr[index] = arr[i]
        }
    }

    // Step 3: Prepare result array with unique elements
    val result = Array(index + 1) { 0 }
    for (i in 0..index) {
        result[i] = arr[i]
    }

}
/*
fun removeDuplicate(arr: IntArray){

}*/
