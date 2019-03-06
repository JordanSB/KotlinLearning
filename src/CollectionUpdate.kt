
// Mutable: you can update, add more
//Inmutable: You cannot update or add more

fun main(){

    //Inmutable:

    var listInmutable = listOf("Jordan", "Tessa")
    for (name in listInmutable){
        println(name)
    }

    //Mutable:

    var listMutable = mutableListOf("Jordan", "Tessa")
    listMutable[0] = "Fred"
    for (name in listMutable){
        println(name)
    }

    var listOfUsersI = mapOf(1 to "Jordan", 2 to "Tessa")
    var listOfUsersM = mutableMapOf(1 to "Jordan", 2 to "Tessa")
}