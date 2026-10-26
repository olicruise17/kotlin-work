// Task 7.7.1: statistics functions

fun median(data: List<Double>): Double{

    val length = data.size

    if (length != 0){

        if (length % 2 == 0){
            val item1 = data[length/2]
            val item2 = data[(length/2)-1]
            return (item1 + item2)/2
        } else {
            return data[length/2]
        }

    }else{
        throw IllegalArgumentException("Invalid list")
    }
}