fun addNumbers(x:Int = 0, y:Int = 0):Int{

    val temp = x + y
    return temp

}

fun displayInfo(vararg names:String){

    for (name in names){
        println(name)
    }

}

fun main(){

    println("Start Main")
    
    var returnSum = addNumbers(3, 4)
    println("returnSum: $returnSum")

    returnSum = addNumbers(12, 5)
    println("returnSum: $returnSum")

    returnSum = addNumbers(3, 7)
    println("returnSum: $returnSum")

    returnSum = addNumbers(y = 5)
    println("returnSum: $returnSum")

    displayInfo(names = *arrayOf("Jordan", "Tessa"))

    println("End Main")

}