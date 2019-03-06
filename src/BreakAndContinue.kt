fun main(){

    println("Continue Example")
    for (number in 1..10){

        if (number == 5){
            continue
        }
        println(number)
    }

    println("\nBreak Example")
    for (number in 1..10){

        if (number == 6){
            break
        }
        println(number)
    }

    println("\nBreak Inner Example")
    loop@ for (number in 1..10){
        println("Number: $number")
        for (innerLoop in 1..7){
            println("innerLoop: $innerLoop")
            if (innerLoop == 6){
                break@loop
            }
        }
    }

    println("End App")

}