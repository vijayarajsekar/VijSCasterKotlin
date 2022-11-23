fun main(args: Array<String>) {
    println("10_LazyInitialization")

    val User_1 = LazyInitialization("Alex", "Don", 19)

    val User_2 by lazy {
        LazyInitialization("Vijay", "Sekar", 37)
    }

    println(User_2.firstName)
}

class LazyInitialization(var firstName: String, var lastName: String, age: Int) {
    init {
        println("User $firstName was created")
    }
}