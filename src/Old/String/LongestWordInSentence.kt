package Old.String

fun main(){
    println("Find Longest word in sentence")
    val str = "hey how are you. I hope every things goes well"
    findLongestWord(str)
}

fun findLongestWord(str: String){
    var currentWordLength = 0
    var lastLargestWord = 0
    var word = ""
    for(i in 0 until str.length){

        if(str[i].isLetter()){

            currentWordLength++
        }else{
            if(lastLargestWord < currentWordLength) {
                lastLargestWord = currentWordLength
                word = str.substring(i-currentWordLength, i )
            }
            currentWordLength = 0
        }

    }

    println("$word : $lastLargestWord")
}