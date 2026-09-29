package Old.nov_dec_2025.Collection


fun main() {

    print("Remove Duplicate in Old.nov_dec_2025.Collection\n")
    val number = listOf(1, 4, 2, 3, 1, 5, 8, 3, 7, 2, 4)
    val name = listOf("Naman", "Raj", "Raj", "Anmol", "Naman")


    // By using list function
    val removeDuplicate = number.distinct()

    println("Original List: $number")
    println("Unique Number List: $removeDuplicate")
    println("Original List: $name")
    println("Unique Name List: ${name.distinct()}")

    // by converting Set
    println("Unique Number List: ${number.toSet().toList()}")
    println("Unique Name List: ${name.toSet().toList()}")

}