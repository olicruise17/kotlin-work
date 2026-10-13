// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

// Name: Oliver Cruise
// StudentID: 201823825

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

// function to check if the triangle is valid

fun isValidTriangle(t: Triple<Double, Double, Double>): Boolean {

    // check validity of triangle and return true if valid
    // if not valid return false

    if ((t.first.toDouble() < t.second.toDouble() + t.third.toDouble()) && (t.second.toDouble() < t.first.toDouble() + t.third.toDouble()) && (t.third.toDouble() < t.second.toDouble() + t.first.toDouble())){

        return true

} else {

    return false
}
}

// function to compute area of triangle

fun triangleArea(t: Triple<Double, Double, Double>): Double {
    
    
    // compute s
    val s = (t.first.toDouble()+t.second.toDouble()+t.third.toDouble())/2

    // compute area
    val area = Math.sqrt(s*(s-t.first.toDouble())*(s-t.second.toDouble())*(s-t.third.toDouble()))

    // return result
    return area
}