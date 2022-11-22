fun main(args: Array<String>) {
    println("4_SecondaryConstructor")

    // Below line using PrimaryConstructor
    val mFriend = SecondaryConstructor("Ajay", "Kumar", 26)

    // Below line using SecondaryConstructor - 1
    val mUser_SC_1 = SecondaryConstructor("Selvam")

    // Below line using SecondaryConstructor - 2
    val mUser_SC_2 = SecondaryConstructor("Vijay", "Sekar")

    println("PC values : ${mFriend.name} , ${mFriend.lastName}, ${mFriend.age}")
}

class SecondaryConstructor(var name: String, var lastName: String, var age: Int) {

    constructor(name: String) : this(name, "User", 18) {
        if (age >= 18) {
            println("SC1 User $name is Adult")
        } else {
            println("SC1 User $name is not an Adult")
        }
    }

    constructor(name: String, lastName: String) : this(name, lastName, 17) {
        if (age >= 18) {
            println("SC2 User $name is Adult")
        } else {
            println("SC2 User $name is not an Adult")
        }
    }
}
