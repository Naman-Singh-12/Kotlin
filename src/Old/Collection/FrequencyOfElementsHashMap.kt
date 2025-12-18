package Old.Collection

fun main(){

    print("Frequency of elements using HashMap\n")
    val frequencyElement = listOf(4,1,4,1,5,7,3,2,6,8,2,3,1,4,6,7,8,9,3,2,3,5,7,4,3)
    val frequencyMap  = HashMap<Int, Int>()

    for(num in frequencyElement){
        frequencyMap[num] = frequencyMap.getOrDefault(num,0)+1
    }

    print("Frequency : $frequencyMap\n")
    for((key, element) in frequencyMap){
        println("$key -> $element")
    }
}