// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()) {
        println("Usage: program <filename>")
        exitProcess(1)
    }

    val data = fetchData(args[0])
    var lowest_temp = 10000.0
    var highest_temp = -10000.0
    var lowest_station = ""
    var highest_station = ""

    for (item in data){
        if(item.second < lowest_temp){
            lowest_temp = item.second
            lowest_station = item.first
        }

        if(item.second > highest_temp){
            highest_temp = item.second
            highest_station = item.first
        }

    }

    println("The highest temperature was $highest_temp at $highest_station")
    println("The lowest temperature was $lowest_temp at $lowest_station")
}
