fun main(args: Array<String>) {

    // Variable declarations
    println("2_Variable Declarations")

    /**
     * Difference between Var / Val
     *  # With "var" we can reassign the value for a variable. Also known as Mutable variable.
     *  # With "val" we cannot reassign the value for a variable. Also known as Immutable variable.
     */

    // Creating and printing Variable with "var" keyword
    var mName = "Vijay"
    println("Given name is $mName")
    // We can also print like below
    println("Given name is " + mName)

    // Re - Assign Value Variable
    mName = "Rajan"
    println("Re-assign > Given name is $mName")

    // Checking is isEmpty - Returns true if this char sequence is empty (contains no characters).
    mName = " "
    println("Given name is Empty -> ${mName.isEmpty()}")

    // Checking is isBlank - Returns `true` if this string is empty or consists solely of whitespace characters
    println("Given name is Empty -> ${mName.isBlank()}")

    // Creating and printing Variable with "val" keyword
    val mCityname = "Chennai"

    println("My city name is $mCityname")


}