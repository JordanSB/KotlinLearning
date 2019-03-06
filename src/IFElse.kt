fun main(){

    println("Please enter your age: ")
    val age = readLine()!!.toInt()

    if (age>= 18){
        println("You can apply for the job")
    } else {
        println("You can not apply for the job")
    }

}