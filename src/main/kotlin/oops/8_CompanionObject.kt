fun main(args: Array<String>) {
    println("8_CompanionObject")

    val result = Calculator.sum(5, 10)

    println("Result is $result")
    println("Max value is " + Calculator.max)
}

class Calculator() {

    companion object {
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a + b;
        }
    }
    /** Also, we use like below
     * fun sum(a: Int, b: Int): Int = a+b
     */

}