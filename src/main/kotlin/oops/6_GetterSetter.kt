fun main(args: Array<String>) {
    println("6_GetterSetter")

    val mDemoUser = GetterSetter("Apple")

    println(mDemoUser.fname)
    println(mDemoUser.lastName)
    println(mDemoUser.age)

    mDemoUser.fname = "Orange   "

}

class GetterSetter(firstName: String, var lastName: String = "LastName", var age: Int = 0) {

    var fname = firstName
        get() {
            return "FirstName -> $field"
        }
    // Also, we can use get() = field

        set(value) {
            println("$value is assigned to FirstName")
            field = value
        }

    /**
     * Here we can use fname = value; This is like, set again and again. Also, it throws "StackOverflowError"
     * To Avoid that we are using "field"
     */
}