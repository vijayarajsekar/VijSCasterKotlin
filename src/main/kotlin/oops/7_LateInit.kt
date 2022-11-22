fun main(args: Array<String>) {
    println("7_LateInit")

    val mDemoUser = LateInit("Apple", "Orange", 19)

    mDemoUser.mFavName = "Avatar"

    println(mDemoUser.mFavName)
}

class LateInit(var firstName: String, var lastName: String, var age: Int) {

    // Assign a value to a property later, we use "lateinit"
    lateinit var mFavName: String
}