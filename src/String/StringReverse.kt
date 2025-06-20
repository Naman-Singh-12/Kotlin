package String

import kotlin.ranges.downTo

fun main(){

    print("Revers String\n")
    var str = "Singh"

    simpleFor(str)

}

fun simpleFor(str: String) {
    for(c in str.length -1 downTo 0){
        print(str[c])
    }
}
