fun main(){

    for (userID in 1..10){
        print("$userID - Enter your name: ")
        val name = readLine()!!.toString()

        print("$userID - Where do you live: ")
        val livePlace = readLine()!!.toString()

        var petName:String?=""

        print("Enter number of pets: ")
        val petCount = readLine()!!.toInt()

        for (petID in 1..petCount){

            print("Enter Pet $petID: ")
            petName = petName + readLine()!!.toString() + ","

        }

        println("====== User Info ======")
        println("Name: $name")
        println("Where you live: $livePlace")
        println("Pets: $petName")

        if (petName!!.contains("cat")){
            println("Cats are evil and will control your mind")
        }

        if (petName!!.contains("dog")){
            println("Dogs are the best")
        }

    }

}