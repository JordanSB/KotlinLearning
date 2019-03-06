
var name:String?= null

fun showUserInfo(){

    name = "Welcome $name"
    // check if user is active
    println("$name")

}

fun main(){

    name = "Jordan"
    println("$name")
    showUserInfo()
    println("$name")

}