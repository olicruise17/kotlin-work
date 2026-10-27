// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){

    init{
        if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideB + sideA)){
            
            throw IllegalArgumentException("triangle not valid")

        }
    }

    val perimeter: Double
        get() =  (sideA + sideB + sideC)

    val area: Double
    
        // compute area
        get() = (Math.sqrt(((sideA + sideB + sideC)/2)*(((sideA + sideB + sideC)/2)-sideA)*(((sideA + sideB + sideC)/2)-sideB)*(((sideA + sideB + sideC)/2)-sideC)))


    val semiPerimeter: Double
        get() = ((sideA + sideB + sideC)/2)


    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}