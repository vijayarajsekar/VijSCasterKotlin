fun main(args: Array<String>) {

    println("14_Inheritance_1")

    val cars = Inheritance_1("BMW", "Red",4,2)
    val plane = Inheritance_1_new("Boing", "Blue", 4, 4)

    println(cars.move())
    println(cars.stop())

    println(plane.move())
    println(plane.stop())
}

open class Vehicle(val name: String, val color: String) {

    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }
}

class Inheritance_1(name: String, color: String, engine: Int, doors: Int) : Vehicle(name, color) {
}

class Inheritance_1_new(name: String, color: String, engine: Int, doors: Int) : Vehicle(name, color) {

    override fun move() {
        flying()
        super.move()
    }

    fun flying(){
        println("The plan is flying")
    }
}