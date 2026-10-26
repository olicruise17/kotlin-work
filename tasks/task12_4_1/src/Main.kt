// Task 12.4.1: main program

fun main(){
    val c1 = Circle(Point(0.0,1.0), 2.0)
    val c1_contains_p = c1.contains(Point(0.0, 0.0))
    println("$c1_contains_p")
}