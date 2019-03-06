fun showInfo(cardID:Int){

    // check is card is valid
    println("CardID: $cardID")

}

fun showInfo(name:String){

    // check if user is active
    println("UserName: $name")

}

fun main(){

    showInfo("Jordan Carroll")
    showInfo(1234567890)

}