fun main(){

    println("====== Pets App ======")

    print("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()
    //Write app in array
    var listOfPets:Array<String>  = Array(maxSize){""}

    for (i in 0 until maxSize){
        listOfPets[i] = readLine()!!.toString()
    }

    for (i in 0 until maxSize){
        println("Pet $i: ${listOfPets[i]}")
    }

}