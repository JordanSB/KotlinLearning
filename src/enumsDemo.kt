enum class Direction(){

    NORTH, SOUTH, EAST, WEST

}

fun main(args:Array<String>){

    var userDirection = Direction.SOUTH

    if (userDirection == Direction.NORTH){
        println("He went North")
    }else{
        println("I don't know where he went")
    }

}