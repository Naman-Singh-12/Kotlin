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
        //nativeAnagramCheck(str1.lowercase(), str2.lowercase())
        //checkAnagram(str1, str2)
        //collectionApproachBySort(str1, str2)
        collectionApproachByMap(str1, str2)

    }
}

fun collectionApproachByMap(str1: String, str2: String) {
    val map1 = str1.replace(" ","").lowercase().groupingBy{it}.eachCount()
    val map2  = str2.replace(" ", "").lowercase().groupingBy{it}.eachCount()

    if (map1 == map2) {
        print("\n $str1 $str2 : Anagrams")

    } else {
        print("\n $str1 $str2 : Not Anagrams")
    }
}


fun collectionApproachBySort(str1: String, str2: String) {

    val s1Sorted = str1.replace("\\s+".toRegex(), "").toCharArray().sorted()
    val s2Sorted = str2.replace(" ", "").toCharArray().sorted()


    if (s1Sorted == s2Sorted) {
        print("\n $str1 $str2 : Anagrams")

    } else {
        print("\n $str1 $str2 : Not Anagrams")
    }

}

fun checkAnagram(str1: String, str2: String) {
    if (str1.length != str2.length) {
        print("\n $str1 $str2  Not Anagrams")
    } else {

        val frequency = IntArray(256)

        for (c in str1) {
            frequency[c.code]++
        }
        for (c in str2) {
            frequency[c.code]--
        }

        for (c in frequency) {
            if (c != 0) {
                print("\n $str1 $str2 Not Anagrams")
                return
            }

        }
        print("\n $str1 $str2  Anagrams")


    }
}


fun nativeAnagramCheck(str1: String, str2: String) {
    if (str1.length != str2.length) {
        print("\n $str1 $str2  Not Anagrams")
        return
    }

    var isAnagram = true
    for (i in 0 until str1.length) {
        if (str1[i] == ' ') {
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

    } else {
        print("\n $str1 $str2  Not Anagrams")
    }
}