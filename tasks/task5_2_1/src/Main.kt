// Task 5.2.1: main program

fun main(args: Array<String>){
    val area = circleArea(args[0].toDouble())
    val perimeter = circlePerimeter(args[0].toDouble())

    println("Area is $area. Perimeter is $perimeter")
}