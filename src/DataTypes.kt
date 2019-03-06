
fun main(){

    var name = "Jordan"
    val age = 24
    val number = 33

    println("name: $name")
    println("age: $age")
    println("number: $number")

    name = "Ryan"

    println("name: $name")

    var department:String?
    department = null
    department = "software"
    print("Department: ${department!!}")
}