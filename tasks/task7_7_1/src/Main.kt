// Task 7.7.1: program to compute stats for a numeric dataset

fun main(){
    val data = readData("data.txt")
    println(data)
    val result = median(data)
    println(result)

}