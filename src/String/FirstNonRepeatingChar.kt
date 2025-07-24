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
    }
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

