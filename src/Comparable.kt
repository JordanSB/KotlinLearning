import java.util.*

class Person(var name:String, var age:Int): Comparable<Person>{


    override fun compareTo(other: Person): Int {
        return this.age -  other.age
    }
}

fun  main(args:Array<String>){
    var listOfNames= ArrayList<Person>()

    listOfNames.add(Person("Jordan",24))
    listOfNames.add(Person("Tessa",20))
    listOfNames.add(Person("Bob",28))

    println("\n===== Before sort =====")
    for (person in listOfNames){
        println("Name:"+person.name)
        println("age:"+person.age)
    }
    println("\n===== After sort =====")
    Collections.sort(listOfNames)
    for (person in listOfNames){
        println("Name:"+person.name)
        println("age:"+person.age)
    }

}