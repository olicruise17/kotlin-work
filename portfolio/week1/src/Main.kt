// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

// Name: Oliver Cruise
// StudentID: 201823825

import kotlin.math.sqrt
import kotlin.system.exitProcess

// start function

fun main(args: Array<String>){

    // validate number of arguments

    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    // convert to doubles for arithmetic

    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    // compute s
    val s = (a+b+c)/2

    // compute area
    val area = Math.sqrt(s*(s-a)*(s-b)*(s-c))

    // print result
    println("Area = %.5f".format(area))

}
