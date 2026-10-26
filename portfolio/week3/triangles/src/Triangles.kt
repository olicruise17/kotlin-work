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

    if ((t.first < t.second + t.third) && (t.second < t.first + t.third) && (t.third < t.second + t.first)){

        return true

    } else {

        return false
    }
}

// function to compute area of triangle

fun triangleArea(t: Triple<Double, Double, Double>): Double {
    
    val is_Valid = isValidTriangle(t)

    if (is_Valid == true) {
        // compute s
        val s = (t.first+t.second+t.third)/2

        // compute area
        val area = Math.sqrt(s*(s-t.first)*(s-t.second)*(s-t.third))

        // return result
        return area

    }else{
        throw IllegalArgumentException("Invalid triangle")
    }
}