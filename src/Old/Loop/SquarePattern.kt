package Old.Loop

fun main(){

    var squareValue = 5

    for(i in 0 until squareValue){
        for(j in 0 until i) {
            print("  *")
        }
        print("\n")
    }
}