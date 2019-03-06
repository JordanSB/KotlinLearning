
fun main(){

    print("Enter number 1: ")
    var number1 = readLine()!!.toInt()
    print("Enter number 2: ")
    var number2 = readLine()!!.toInt()

    var temp = number1
    number1 = number2
    number2 = temp

    println("Your swapped numbers: Number 1: $number1, Number 2: $number2")

}