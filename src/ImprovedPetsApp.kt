import java.util.*
import kotlin.collections.HashMap

fun main(){

    var listOfUsers = HashMap<String, LinkedList<String>>()

    while (true){
        print("Enter your name or quit: ")
        val name = readLine()!!.toString()

        if (name == "quit"){
            break
        }

        print("Where do you live: ")
        val livePlace = readLine()!!.toString()

        var petName:String?=""

        var listOfUserPets = LinkedList<String>()
        do{
            print("Enter Pet name or next: ")
            val petName = petName + readLine()!!.toString()
            if (petName != "next"){
                listOfUserPets.add(petName)
            }
        }while (petName != "next")

        listOfUsers["$name:$livePlace"] = listOfUserPets

    }

    println("====== User Info ======")
    for (key in listOfUsers.keys){

        println("Name and place lived: $key")
        val listOfPets = listOfUsers[key]!!
        for (petName in listOfPets){
            println("petName: $petName")
        }


        if (listOfPets.contains("cat")){
            println("Cats are evil and will control your mind")
        }

    }

}