// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val account1 = SavingsAccount("Oliver Cruise", 1.8)
    account1.deposit(1250)
    account1.applyInterest()
    account1.applyInterest()
    account1.applyInterest()
    account1.applyInterest()
    account1.applyInterest()
    account1.withdraw(50)
    println(account1.balance)
}
