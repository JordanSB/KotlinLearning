fun main(){


    println("Enter your grade: ")
    val grade = readLine()!!.toInt()

    when{

        grade>= 90 -> println("A")
        grade in 80..89 -> println("B")
        grade in 70..79 -> println("C")
        else -> println("Fail")


        }


}