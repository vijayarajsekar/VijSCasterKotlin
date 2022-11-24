fun main(args: Array<String>) {

    println("15_SealedClasses")
    val success = Result.Success("Success !")
    val error = Result.Error("Error !")
    val progress = Result.progress("Progress !")

    getData(success)

    getData(error)

    getData(progress)
}

fun getData(result: Result) {
    when (result) {
        is Result.Error -> result.showMessaeg()
        is Result.Success -> result.showMessaeg()
        is Result.progress -> result.showMessaeg()
    }
}

sealed class Result(val message: String) {
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)

    class progress(message: String) : Result(message)

    fun showMessaeg() {
        println("Result : $message")
    }
}

