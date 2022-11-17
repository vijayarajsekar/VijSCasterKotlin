fun main(args: Array<String>) {
    println("6_ForLoop")

    // Usual Way of printing
    for (i in 1..10) {
        println(i)
    }

    // Another way of print using UNTIL
    /**
     * Here the difference is,
     * UNTIL prints from 1 to 9
     * whereas .. prints from 1 to 10
     * Also "util" we can use min to high; reverse case will not work / print
     */
    for (i in 1 until 10){
        println(i)
    }

    // Another way of print using DOWNTO
    /**
     * Here the difference is
     * DOWNTO prints from 10 to 1
     * Also "downTo" we can use high to min; reverse case will not work / print
     */
    for (i in 10 downTo  1){
        println(i)
    }

    // Another way of print using STEP
    /**
     * Here value prints by step
     * And step - value we can use as per the requirement
     * Below, code will print 1,3,5,7,9 from 1 to 10
     */
    for (i in 1 until   10 step 2){
        println(i)
    }
}