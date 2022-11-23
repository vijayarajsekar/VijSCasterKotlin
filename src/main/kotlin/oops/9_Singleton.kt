fun main(args: Array<String>) {
    println("9_Singleton")

    // Type 1
    val instance: Database? = Database.getInstance()
    val instance2: Database? = Database.getInstance()
    println(instance)
    println(instance2)

    // Type 2
    println(DatabaseNew)
    println(DatabaseNew)
}

/**
 * Type 1 : We use "compainon object"
 */
class Database private constructor() {
    companion object {
        private var mInstance: Database? = null

        fun getInstance(): Database? {
            if (mInstance == null) {
                mInstance = Database()
            }
            return mInstance
        }
    }
}

/**
 * Type 2 : We use "object"
 */
object DatabaseNew {
    init {
        println("\nDatabaseNew created")
    }
}