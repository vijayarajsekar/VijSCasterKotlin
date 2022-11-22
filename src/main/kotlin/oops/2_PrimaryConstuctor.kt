fun main(args: Array<String>) {
    println("2_PrimaryConstuctor")

    val mCar1 = PrimaryConstructor("  Tesla", "S Plaid", "Red", 4)

    println("Car name = ${mCar1.name}")
    println("Car model = ${mCar1.model}")
    println("Car color = ${mCar1.color}")
    println("Car doors = ${mCar1.doors}")

    mCar1.move()
    mCar1.stop()
}

class PrimaryConstructor(name: String, var model: String, var color: String, var doors: Int) {

    /**
     * 1. When to use as parameter
     * 2. When to use as Variable
     *
     *  Below is the example of, when to use as variable
     */
    var name = name.trim()

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has Stopped")
    }
}