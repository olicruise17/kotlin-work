import java.nio.file.Paths
import kotlin.io.path.forEachLine

fun main(args: Array<String>) {

    val path = Paths.get(args[0])


    var highest = 0
    var highest_line = 0
    var current_line = 1

    if (args.isEmpty()) {
        println("Please provide a file name.")
        return
    }

    path.forEachLine {
        

        val line_length = it.length

        if (line_length > highest) {
            highest = line_length
            highest_line = current_line
        }

        current_line++
    }

    println("Line $highest_line is the longest (length = $highest)")
}