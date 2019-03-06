fun main(){
    val message = "Welcome to Secure Broadcast"
    val name = "Jordan"

    val allMessage = "$message, $name"
    println(allMessage[3])
    println(allMessage.toLowerCase())
    println(allMessage.toUpperCase())
    println(message.trim())
    println(message)

    val tokens = message.split(" ")
    for (token in tokens){

        if (!token.contains("to") || !token.contains("Secure")){
            println("Token: $token")
        }

    }


}