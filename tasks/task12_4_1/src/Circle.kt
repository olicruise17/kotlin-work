// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.hypot

class Circle(val centre: Point, val radius: Double){
    init {
        if (radius <= 0){
            throw IllegalArgumentException("radius must be greater than 0")
        }
    }

    fun area(): Double{
        return PI * radius * radius
    }

    fun contains(p: Point): String{
        val dist_from_centre = hypot(p.x-centre.x, p.y-centre.y)
        if (dist_from_centre < radius){
            return "point is in circle"
        } else{
            return "point is not in circle"
        }
    }

}