fun main(args: Array<String>) {

    val mUser = User("Vijay", "Sekar", 36)
    val mFriend = User("Ajay", "Kumar", 26)

    println("Name ${mFriend.name}")
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if (name.lowercase().startsWith("v")) {
            this.name = name
        } else {
            this.name = "Default User"
            println("The name dosent start with 'V' or 'v'")
        }
    }
}
