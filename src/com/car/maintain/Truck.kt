package com.car.maintain

class Truck:ClassConstructor{

    var subType:String?=null

    constructor( type:String,  model:Int,  price:Double,  milesDriven:Int,  owner:String, subType:String):
            super(type, model, price, milesDriven, owner){

        this.subType = subType
    }

    constructor( type:String,  model:Int,  price:Double,  milesDriven:Int, subType:String):
            super(type, model, price, milesDriven){

        this.subType = subType
    }

}

fun main(){



    val truck = Truck("Audi", 2018, 10000.0, 133, "Jordan", "Pickup Truck")
    println(truck.type)
    println(truck.model)
    println(truck.price)
    println(truck.milesDriven)
    println(truck.owner)
    println(truck.subType)
    println("£${truck.getCarPrice()}")

    val truck2 = Truck("Ferrari", 2013, 8763.0, 245, "Garbage")
    println(truck2.type)
    println(truck2.model)
    println(truck2.price)
    println(truck2.milesDriven)
    println(truck2.subType)
    println("£${truck2.getCarPrice()}")

}
