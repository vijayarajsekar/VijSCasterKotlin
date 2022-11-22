fun main(args: Array<String>) {
    println("5_ConstParamDefValues")

    val mUser = ConstParamDefValues("Ajay")
    val mFriend = ConstParamDefValues("Ajay", "Kumar", 26)

    // Below line, represents Named arguments
    val mDemoUser = ConstParamDefValues(age = 19, firstName = "Apple", lastName = "Orange")

}

// Below line, we assigned Default Values to Constructor variables
class ConstParamDefValues(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {

}
