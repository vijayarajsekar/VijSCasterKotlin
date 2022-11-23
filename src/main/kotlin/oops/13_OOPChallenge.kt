fun main(args: Array<String>) {

    println("13_OOPChallenge")

    val account1 = Account("Vijay")
    account1.deposite(1000)
    account1.withdraw(500)
    account1.deposite(-10)
    account1.withdraw(-200)

    println(" Balance is ${account1.calculateBalance()}")

}


class Account(val accountName: String) {
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposite(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount

            println("$amount deposited. Balance is ${this.balance}")
        } else {
            println("Cannot deposite invalid amount")
        }
    }

    fun withdraw(withdrawal: Int) {

        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal withdrawn. Balance is ${this.balance}")
        } else {
            println("Cannot withdraw invalid amount")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0

        for (trasaction in transactions) {
            this.balance += trasaction
        }

        return this.balance
    }
}