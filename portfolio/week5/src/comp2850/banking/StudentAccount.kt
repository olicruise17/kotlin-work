// Name: Oliver Cruise
// StudentID: 201823825

// creates package

package comp2850.banking

// StudentAccount class inherits from BankAccount class

class StudentAccount(holder : String): BankAccount(holder){

    // initialiser

    init {
        println("Savings Account constructor invoked")
    }

    // sets overdraft and ensures it is less than max overdraft and greater than 0

    var overdraft: Int = 0
    set(value) {
        if (value < 0 || value > 100){
            throw IllegalArgumentException("Overdraft can only be between 0 and 100")
        } else {
                field = value
            }
    }


    // function for withdrawing

    override fun withdraw(amount: Int){

        // ensures that once withdraw has occur balance is
        // not less than overdraft

        if (balance - amount < -overdraft){
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        
        // ensures amount to be withdrew is greater than 0

        else if (amount <= 0){
            throw IllegalArgumentException("Withdrawal amount must be greater than 0")
        }
            else{
                balance -= amount
            }
          
    }

    // function returns true if money can be withdrawing
    // otherwise false

    fun withdrawalsAllowed(): Boolean{
        if (balance + overdraft == 0){
            return false
        }else{
            return true
        }
    }

    // toString function to format the account

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}