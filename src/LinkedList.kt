import java.util.*

fun main(){

    println("====== Pets App ======")

    //Write app in array
    var listOfPets = LinkedList<String>()

    do {
        print("Enter pet name of exit to quit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit"){
            listOfPets.add(petName)
        }

    }while (petName != "quit")

    println("Your pets are using index")
    for (i in 0 until listOfPets.size){
        println("Pet $i: ${listOfPets[i]}")
    }

    println("Your pets are using object")
    for (pet in listOfPets){
        println("Pet $pet")
    }

    if (listOfPets.contains("cat")){
        println("Cats are evil")
    }

}