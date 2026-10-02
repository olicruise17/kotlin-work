// Task 4.2: use of if and ranges

fun main() {
    println("MENU:")
    println("a. Margherita")
    println("b. Pepperoni")
    println("c. Ham and mushroom")
    println("d. Meat feast")

    print("Enter option: ")
    val option = readln().lowercase()

    if (option in "a".."d" && option.length == 1) {
        println("Order Accepted")
    }
    else {
        println("Invalid choice")
    }
}
