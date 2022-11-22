fun main(args: Array<String>) {
    println("1_OOP_Classes")

    val mCar1 = Car()

    mCar1.name = "Tesla"
    mCar1.model = "S Plaid"
    mCar1.color = "Red"
    mCar1.doors = 4

    println("Car name = ${mCar1.name}")
    println("Car model = ${mCar1.model}")
    println("Car color = ${mCar1.color}")
    println("Car doors = ${mCar1.doors}")

    mCar1.move()
    mCar1.stop()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has Stopped")
    }
}