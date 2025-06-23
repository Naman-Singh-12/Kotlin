package String

fun main() {
    print("Anagrams String")

    // Test Case 6: Case Sensitivity - Decide if you want to ignore case


    val testCases = listOf(
        Pair("listen", "silent"),          // Should be Anagram ✅
        Pair("hello", "helloo"),           // Not Anagram ❌ (different lengths)
        Pair("hello", "helol"),            // Should be Anagram ✅
        Pair("aabbcc", "abcabc"),          // Should be Anagram ✅
        Pair("helllo", "ellkho"),          // Not Anagram ❌ (different characters)
        Pair("Listen", "Silent"),          // Case sensitive: will fail if you don’t handle case
        Pair("Dormitory", "Dirty room"),   // Handle spaces: will fail if you don’t remove spaces
        Pair("", ""),                      // Anagram ✅ (trivial case)
        Pair("a", "a"),                    // Anagram ✅
        Pair("a", "b"),                    // Not Anagram ❌ (different characters)
        Pair("abc", "abc")                 // Anagram ✅
    )



    for ((str1, str2) in testCases) {
        nativeAnagramCheck(str1.lowercase(), str2.lowercase())
    }
    //nativeAnagramCheck(str1, str2)
    //collectionApproach(str1.lowercase(), str2.lowercase())
}

fun collectionApproach(str1: String, str2: String) {

    val mapFirst = mutableMapOf<Char, Int>()
    str1.forEach {
        mapFirst[it] = mapFirst.getOrDefault(it, 0) + 1
    }
    val mapSec = mutableMapOf<Char, Int>()
    str2.forEach {
        mapSec[it] = mapSec.getOrDefault(it, 0) + 1
    }
    mapFirst.forEach {
        print(" $it")
    }
    print("\n")
    mapSec.forEach {
        print(" $it")
    }

}

fun nativeAnagramCheck(str1: String, str2: String) {
    if (str1.length != str2.length) {
        print("\n $str1 $str2  Not Anagrams")
        return
    }

    var isAnagram = true
    for (i in 0 until str1.length) {
        if(str1[i] == ' ')
        {
            continue
        }
        var selfCount = 0
        for (k in 0 until str1.length) {
            if (str1[i] == str1[k]) {
                selfCount++
            }
        }
       // print("\ni > ${str1[i]} > $selfCount")
        var count = 0
        for (j in 0 until str2.length) {
            if (str1[i] == str2[j]) {
                //print("\nj > ${str2[j]} > $count")
                count++
            }
        }
       // print("\nCount > $count selfCount> $selfCount")
        if (count != selfCount) {
            isAnagram = false
            break
        }
    }
    if (isAnagram) {
        print("\n $str1 $str2  Anagrams")

    }else{
        print("\n $str1 $str2  Not Anagrams")
    }
}