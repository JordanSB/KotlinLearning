package com.car.maintain

class Car(val type:String, val model:Int, val price:Double, val milesDriven:Int, val owner:String){

    init{

        println("Object class is created")

    }

    fun getCarPrice():Double{

        return price - (milesDriven.toDouble()*10)

    }

}

fun main(){

    /*val car = Car("Audi", 2018, 10000.0, 133, "Jordan")
    println(car.type)
    println(car.model)
    println(car.price)
    println(car.milesDriven)
    println(car.owner)
    println("£${car.getCarPrice()}")

    val car2 = Car("Ferrari", 2013, 8763.0, 245, "Tessa")
    println(car2.type)
    println(car2.model)
    println(car2.price)
    println(car2.milesDriven)
    println(car2.owner)
    println("£${car2.getCarPrice()}")*/

    //List of cars

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("Audi", 2018, 10000.0, 133, "Jordan"))
    listOfCar.add(Car("Ferrari", 2013, 8763.0, 245, "Tessa"))

    for (car in listOfCar){

        println("\n==========")
        println(car.model)
        println(car.owner)
        println(car.getCarPrice())
    }

}
