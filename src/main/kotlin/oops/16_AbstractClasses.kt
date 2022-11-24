import java.awt.Color

fun main(args: Array<String>) {
    println("16_AbstractClasses")
}

abstract class vehicle() {

    val text = "Some text" // We cannot do this in interface

    abstract fun move()

    abstract fun stop()
}

class car(var name: String, var color: String, val engine: Int, val door: Int) : vehicle() {
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}