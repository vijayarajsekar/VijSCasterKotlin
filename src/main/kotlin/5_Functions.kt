fun main(args: Array<String>) {
    println("5_Functions")

    // Default function calling
    sayHello("Alex", 36)

    // Function returns value
    println("Max value of 2,3 is ${getMaxVal(2, 3)}")
    println("Max value of 9,7 is ${getMaxVal_new(9, 7)}")

    /**
     *  Function : Named Parameters
     */
    // Calling without values; Here Default value is considered
    namedParam()
    // Passing required values
    namedParam("Vijay", "How are you ?")
    // Passing only 1st Param
    namedParam("Vijay")
    // Passing only 2nd Param
    namedParam(message = "What are you doing ?")
    // Passing invalid order as well
    namedParam(message = "What are you doing ?", name = "Siri")

    // Function returns another function
    functionReturnsAnotherFunc("Alexa")
    functionReturnsAnotherFunc("Alexa", "Where are you from ?")

    /**
     * Function with "vararg"
     * Here "vararg" is used to pass multiple values; instead of structured function with limited values
     */
    println("vararg -> Sum of ${callVarArg(1, 2, 3, 4)}")
}

fun sayHello(name: String, age: Int) {
    println("Hello, $name! your age is $age")

    /**
     * From the above line, we cannot re-assign value to parameter "age",
     * parameter inside the function represents VAL, Also known as immutable
     *
     * If required, we need to create new VAR variable inside the method and use it; like below
     *  var newAge = age + 5
     *  println("Hello, $name! your age is $newAge")
     */

    val newAge = age + 5
    println("Hello, $name! your new age is $newAge")

}
// Function - return and expressions

fun getMaxVal(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

/**
 * Also we can do above getMaxVal() function like below
 */
fun getMaxVal_new(a: Int, b: Int): Int = if (a > b) a else b


// Named Parameter example
fun namedParam(name: String = "Default User", message: String = "Good Morning !") {
    println("Hello $name , $message")
}

// Function returns another function
fun functionReturnsAnotherFunc(name: String = "Default User", message: String = getMessage()) {
    println("Hello $name , $message")
}

fun getMessage() = "Good Morning"

// VarArg usage
fun callVarArg(vararg values: Int): Int {
    var result = 0

    for (numbers in values) {
        result += numbers
    }
    return result
}