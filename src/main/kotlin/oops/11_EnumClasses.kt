import com.sun.xml.internal.bind.v2.util.EditDistance

fun main(args: Array<String>) {
    println("11_EnumClasses")

    // Usually printing
    println(Direction.NORTH)
    println(Direction.SOUTH)
    println(Direction.EAST)
    println(Direction.WEST)

    // Print using forloop
    for (direction in Direction.values()) {
        println(direction.drirection + direction.distance)
    }

    // print using direct properties
    println(Direction.NORTH.drirection)
    println(Direction.NORTH.distance)

    //print using ENUM function
    Direction.NORTH.printData()

    // Print using WHEN

    val newDirection = Direction.NORTH

    when(newDirection){
        Direction.NORTH -> {
            println("The direction is NORTH")
        }
        Direction.SOUTH -> println("The direction is SOUTH")
        Direction.EAST -> println("The direction is EAST")
        Direction.WEST -> println("The direction is WEST")
    }
}

enum class Direction(var drirection: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 30),
    WEST("west", 40);

    fun printData(){
        println("Direction = $drirection and Distance is $distance")
    }
}