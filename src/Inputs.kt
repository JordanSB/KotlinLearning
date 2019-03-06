
fun main(){

    //Asking for user input
    print("Enter Name: ")
    val name = readLine()!!.toString()
    print("Enter Age: ")
    val age = readLine()!!.toInt()
    print("Enter Number: ")
    val number = readLine()!!.toDouble()

    //Printing user information
    println("===== User Info =====")
    println("Your Name Is: $name")
    println("Your Age Is: $age")
    println("Your Number Is: $number")
}