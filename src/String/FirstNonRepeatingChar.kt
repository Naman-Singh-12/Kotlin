package String

fun main(){
    println("First Non Repetitive Character")
    val inputs = listOf(
        "leetcode",
        "loveleetcode",
        "aabb",
        "",
        "a",
        "aa",
        "ab",
        "abcabcdd",
        "a".repeat(9) + "b" + "a",
        "abcdefghijklmnopqrstuvwxyz".repeat(11),
        "a".repeat(10),
        "z".repeat(8) + "y",
        "abcdabcdz",
        "abacabad",
        "aaabcccdeeef"
    )
    for(i in inputs) {
        println("First non repetitive char in $i is : ${nativeWay(i)}")
        println("First non repetitive char in $i is : ${collectionWay(i)}")
    }
}

fun collectionWay(str: String): String {
     var countNonRepeat = mutableMapOf<Char, Int>()

    for(ch in str){
        countNonRepeat[ch] = countNonRepeat.getOrDefault(ch,0)+1
    }

    for(ch in str){
        if(countNonRepeat[ch] == 1){
           return ch.toString()
        }
    }

    return "Non"

}

fun nativeWay(str: String): String {

    var isRepeated = false
    var thatChar = "Non"

    for(i in 0 until str.length){
        for(j in 0 until str.length){
            if(i != j){
                if (str[i] == str[j])
                {
                    isRepeated = true
                    break
                }
            }

        }
        if(!isRepeated) {
            thatChar = str[i].toString()
            break
        }
        isRepeated = false
    }
    return thatChar

}

fun nativeWayByChatGPT(str: String): String {
    for (i in str.indices) {
        var isUnique = true
        for (j in str.indices) {
            if (i != j && str[i] == str[j]) {
                isUnique = false
                break
            }
        }
        if (isUnique) return str[i].toString()
    }
    return "Non"
}

