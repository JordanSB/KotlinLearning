import java.io.File
import java.io.FileWriter

fun main(args:Array<String>){

    print("Enter your text: ")
    var str:String = readLine()!!.toString()
    WriteToFile(str)

}

fun WriteToFile(str:String){

    try {
        var fo=FileWriter("test.txt", true)
        fo.write(str+ "\n")
        fo.close()
    } catch (ex:Exception){
        print(ex.message)
    }


}