// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    var current_temp = args[0].toDouble()
    val max_temp = args[1].toDouble()
    val inc = args[2].toDouble()
    println("Celcius | Fahrenheit")

    while (current_temp < max_temp) {

        current_temp = current_temp + inc
        var fahrenheit_temp = (current_temp * 1.8) + 32

        print("%.1f".format(current_temp))
        println(" | %.1f".format(fahrenheit_temp))
    }
}
