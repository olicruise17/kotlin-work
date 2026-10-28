// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main(){
    val p1 = Person("Harry", LocalDate(1066, 12 , 1))
    println(p1.age)
}