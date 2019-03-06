fun main(){

    println("Enter Number 1: ")
    val number1 = readLine()!!.toInt()
    println("Enter Number 2: ")
    val number2 = readLine()!!.toInt()

    val sum = number1 + number2
    println("Sum equals: $sum")

    val sub = number1 - number2
    println("Subtract equals: $sub")

    val mul = number1 * number2
    println("Multiple equals: $mul")

    val div = number1 / number2
    println("Divide equals: $div")

}