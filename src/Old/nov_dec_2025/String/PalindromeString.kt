package Old.nov_dec_2025.String

fun main(){

    print("Palindrome Old.nov_dec_2025.String\n")
    var str = "Lol"

    print("In normal $str is : ${isPalindrome(str)}")
    println("In case sensitive $str is : ${isPalindrome(str.uppercase())}")



}

fun isPalindrome(str: String): Boolean{
    for(i in 0 until str.length/2){
        if(str[i]  != str[str.length -1 -i])
        {
            return false
        }
    }
    return true
}