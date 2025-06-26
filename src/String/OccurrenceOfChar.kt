package String

fun main(){

    print("Occurrence of each character in string")
    val arr = arrayOf("aa aAa","abc123","&*()","Aa","abc")
    arr.forEach{
        //checkOccurrenceByNative(it.replace(" ","").lowercase())
        checkOccurrenceByUni(it.replace(" ","").lowercase())

    }
}

fun checkOccurrenceByUni(str: String) {

    val frequency = IntArray(256) { 0 }
    val visited = BooleanArray(256) { false }


    for (i in str) {
        frequency[i.code]++
    }

    for (ch in str) {
        if (!visited[ch.code]) {
            println("\n$ch : ${frequency[ch.code]}")
            visited[ch.code] = true
        }
    }

    /*for (ch in str.toSet()) {
        println("\n $ch : ${frequency[ch.code]}")
    }*/


}

fun checkOccurrenceByNative(str: String) {
    print("\n$str")
    var already = ""
    for(i in 0 until str.length)
    {
        if(already.contains(str[i])){
            continue
        }else{
            already = already+str[i]
        }
        var count= 0
        for(j in 0 until str.length){
            if(str[i] == str[j]){
                count++
            }
        }

        print("\n ${str[i]} : $count")
    }
}
