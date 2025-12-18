package Old.String

fun main()
{
    println("Find both string have valid rotation")
    val str1 = "ABCD"
    val str2 = "DCBA"
    val testCases = listOf(
        RotationTestCase("rotation", "tionrota", true),
        RotationTestCase("aaaa", "aaaa", true),
        RotationTestCase("abcde", "deabc", true),
        RotationTestCase("waterbottle", "erbottlewat", true),
        RotationTestCase("xyz", "zxy", true),
        RotationTestCase("hello", "ellohh", false),
        RotationTestCase("abc", "acb", false),
        RotationTestCase("Singh", "Hgnis", false),
        RotationTestCase("abcd", "abcde", false),
        RotationTestCase("java", "avaj", false)
    )
    for(i in testCases) {
        //checkValidRotationNative(i.str1.trim().lowercase(), i.str2.trim().lowercase())
       println("${i.str1} and ${i.str2} is rotation : ${isRotation(i.str1.trim().lowercase(), i.str2.trim().lowercase())}")
    }
}
data class RotationTestCase(val str1: String, val str2: String, val expected: Boolean)


fun checkValidRotationNative(str1: String, str2: String) {

    var isRotation = true
    if(str1.length != str2.length)
    {
        println("$str1 and $str2 is not rotation of another")
    }else {
        for (i in 0 until str1.length)
        {
            if(str1[i] != str2[str2.length -i-1]){
                isRotation = false
                break
            }
        }

        if(isRotation) {
            println("$str1 and $str2 is rotation of another")
        }else{
            println("$str1 and $str2 is not rotation of another")
        }
    }

}

fun isRotation(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    return (str1 + str1).contains(str2)
}

