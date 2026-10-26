// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float{

    val length = data.size

    if (length % 2 == 0){
        val item1 = data[length/2]
        val item2 = data[(length/2)-1]
        return (item1 + item2)/2
    } else {
        return data[length/2]
    }
}