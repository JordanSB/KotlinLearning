class UserAdmins<T> (credit:T){

    init{
        println(credit)
    }

}

fun <T> display(process: T){
    println(process)
}

fun main(args:Array<String>){

    var userAdmin = UserAdmins<String>("Jordan")
    var userAdmin2 = UserAdmins<Int>(123)
    var userAdmin3 = UserAdmins<Double>(123.0)

    display<Int>(22)
    display<String>("string")

}