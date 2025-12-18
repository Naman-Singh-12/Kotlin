package Old.String

fun main() {
    println("Count type of char in string ;)")

    val testInputs = listOf(
        "Hello123!",
        "Kotlin@2025#Dev",
        "AaEeIiOoUu",
        "1234567890",
        "!!@@##$$%%^^&&**(()))",
        "The quick brown fox jumps over the lazy dog 9876543210",
        "[]\\^_`{|}~",
        "   ", // 3 spaces
        "ABCDabcdEFGHefgh",
        "",
        "~~~~____----++++====",
        "😀😁😂🤣😃😄😅😆😉😊", // Emojis
        "abcABC123!@# \t\n", // tabs, newline, space
        "ZzYyXxWwVvUuTt",
        "👨‍💻🔥💡🧠⚡📱" // emojis & multi-codepoint characters
    )


    for (i in testInputs) {
        //countChar(str)
        countCharSec(i.lowercase())
    }
}

fun countChar(str: String) {
    var vowelCount = 0
    var consonantsCount = 0
    var digitCount = 0
    var specialCount = 0
    for (i in 0 until str.length) {
        if (str[i].isLetter()) {
            if ("aeiou".contains(str[i])) {
                vowelCount++
            } else {
                consonantsCount++
            }

        } else if (str[i].isDigit()) {
            digitCount++
        } else if (!str[i].isLetterOrDigit()) {
            specialCount++
        } else {
            println("Ye kya de diya bhai....")
        }
    }

    println("Vowel : $vowelCount")
    println("Consonants : $consonantsCount")
    println("Digit : $digitCount")
    println("Special : $specialCount")

}

fun countCharSec(str: String) {
    var vowelCount = 0
    var consonantsCount = 0
    var digitCount = 0
    var specialCount = 0
    println(" Old.String : $str")
    for (i in 0 until str.length) {

        if (str[i].code >= 97 && str[i].code <= 122) {
            if ("aeiou".contains(str[i])) {
                vowelCount++
            } else {
                consonantsCount++
            }
        } else if (str[i].code >= 48 && str[i].code <= 57) {
            digitCount++
        } else {
            specialCount++
        }

    }

    println("Vowel : $vowelCount")
    println("Consonants : $consonantsCount")
    println("Digit : $digitCount")
    println("Special : $specialCount")

}