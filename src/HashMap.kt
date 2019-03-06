fun main(){

    var listOfUsers = hashMapOf<Int, String>()

    listOfUsers[123] = "Jordan"
    listOfUsers[456] = "Tessa"
    listOfUsers[789] = "Bob"

    for (key in listOfUsers.keys)

    println("$key: ${listOfUsers[key]}")

}