fun main(){

    print("Pick food item: ")
    val foodID = readLine()!!.toInt()

    when(foodID){

        1 -> {
            println("Sandwich")
        }

        2 -> {
            println("Fruit")
        }

        3 -> {
            println("Burger")
        }

        4 -> {
            println("Chips")
        }

        else -> {
            println("You did not order anything")
        }

    }

}