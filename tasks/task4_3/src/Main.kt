// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 3) {
        println("3 Arguments needed")
        exitProcess(1)
    }
    else {
        val average = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble())/3

        val grade = when(average) {
            in 0.0..39.0 -> "Fail"
            in 40.0..69.0 -> "Pass"
            in 70.0..100.0 -> "Distinction"
            else -> "?"
        }

        println("You got an average score of $average and a grade of $grade")
    }

}