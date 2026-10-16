// Task 5.1.2: main program

fun main(args: Array<String>){

    if (args.size != 0){
        rollDie(args[0].toInt())
    } else {
        rollDie()
    }

}