import java.util.*

fun main(){

    print("Enter Day of Birth: ")
    val dayOfBirth = readLine()!!.toInt()
    print("Enter Month of Birth: ")
    val monthOfBirth = readLine()!!.toInt()
    print("Enter Year of Birth: ")
    val yearOfBirth = readLine()!!.toInt()

    val dayInDevice = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    val monthInDevice = Calendar.getInstance().get(Calendar.MONTH)
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)

    val ageDay = dayInDevice - dayOfBirth
    val ageMonth = monthInDevice - monthOfBirth
    val ageYear = yearInDevice - yearOfBirth

    println("You are $ageYear years, $ageMonth months and $ageDay days old")

}