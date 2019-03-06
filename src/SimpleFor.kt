fun main(){

    println("===== Increment =====")
    for (i in 0..100 step 2){
        println("Number: $i")
    }

    println("===== Decrement =====")
    for (i in 100 downTo 0 step 2){
        println("Number: $i")
    }

    println("End App")

}