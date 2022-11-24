fun main(args: Array<String>) {
    println("17_DataClasses")

    val user1 = DataClasses("Alex", "Apple", 23)
    val user2 = DataClasses("Alex", "Apple", 23)

    println(user1 == user2)

    println(user1)
    println(user2)
}

data class DataClasses(var fname: String, var lname: String, var age: Int)

// Below logic implemented when we add "data" keyword in class

// class DataClasses(var fname: String, var lname: String, var age: Int) {
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//
//        if (other is DataClasses) {
//            return this.fname == other.fname
//                    && this.lname == other.lname
//                    && this.age == other.age
//        }
//
//        return false
//    }
//
//    override fun toString(): String {
//        return super.toString()
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//}