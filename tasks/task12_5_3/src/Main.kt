// Task 12.5.3: demo program for class with custom setter
import java.time.LocalDate

fun main(){
    val p1 = Person("Harry", LocalDate.of(2013,12,1))
    p1.name = ""
}