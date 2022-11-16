fun main(args: Array<String>) {
    println("4_NullHandling")
    var mName: String = "India"
    // Below line will through error, because "Null can not be a value of a non-null type String"
    // mName = null

    // Due to above reason, we need to create a variable like below
    var mAge: Int? = 10
    mAge = null

    println(mAge)

    /**
     * Nullable Safe Calls (?.) in Kotlin
     */

    var firstName: String? = "Apple"

    // Here ?. is checking null, if the firstName is null, returning null, else return firstName length
    var length = firstName?.length

    /** Above single line is equal to below
     * var txtLength=if(firstName !=null) firstName.length else 0
     *
     * So, this is the usage of Nullable Safe Calls (?.)
     */

    // Kotlin Elvis Operator ?:
    var mLastName: String = "Germany"

    var txtLength = if (mLastName != null) mLastName.length else 0

    // Here above line is replaced with Elvis Operator,. like below
    var mLength = mLastName?.length ?: 0

    /** So the usage of Elvis Operator is, From the above line,
     * anything before ( ?: ) is null result is "0", else length will be returned
     *
     * This is the usage of Elvis( ?: ) operator
     */

}