// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here

    val max_num = args[0].toInt()
    var total = 0

    for (n in 1..max_num step 2){
        total += n
    }

    println("Total: $total")
}
