abstract class CreditCard(){

    fun CreditID():String{
        return "6398465dsnkds"
    }

    abstract fun newCredit()

}

class UserInfo():CreditCard(){

    fun getInfo():String{
        return CreditID()
    }

    override fun newCredit() {
        println("New credit created")
    }

}

fun main(args:Array<String>){

    var user = UserInfo()
    println(user.getInfo())

}