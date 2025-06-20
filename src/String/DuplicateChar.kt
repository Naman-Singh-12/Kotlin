package String

fun main(){
    print("Duplicate character in string")
    var str = "Hey How are you Aman"

    byNaiveApproach (str.lowercase())
    byCollection(str.lowercase())


}

fun byCollection(str: String) {

    val map =  mutableMapOf<Char, Int>()
    str.forEach{
        if(it != ' '){
            map[it] = map.getOrDefault(it, 0)+1
        }
    }

    println("\n $map")
}

fun byNaiveApproach (str: String) {
    var already = StringBuilder()
    for(i in 0 until str.length){
        if(already.contains(str[i]) || str[i] == ' '){
            continue
        }else{
            already = already.append(str[i])
            already = already.append(str[i])
            already = already.append(str[i])
        }
        var count = 0
        for(j in 0 until str.length){
            if(str[j]==str[i]){
                count++
            }
        }
        print("\n${str[i]} : "+count)
    }
}
