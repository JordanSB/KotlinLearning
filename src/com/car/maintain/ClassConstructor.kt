package com.car.maintain

open class ClassConstructor(){

    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDriven:Int?=0
    var owner:String?=null

    constructor( type:String,  model:Int,  price:Double,  milesDriven:Int,  owner:String):this(){

        this.type = type
        this.model = model
        this.price = price
        this.milesDriven = milesDriven
        this.owner = owner
    }

    constructor( type:String,  model:Int,  price:Double,  milesDriven:Int):this(){

        this.type = type
        this.model = model
        this.price = price
        this.milesDriven = milesDriven
        this.owner = owner
    }

    open fun getCarPrice():Double{

        return this.price!! - (milesDriven!!.toDouble()*10)

    }

}

fun main(){

    val car = ClassConstructor("Audi", 2018, 10000.0, 133, "Jordan")
    println(car.type)
    println(car.model)
    println(car.price)
    println(car.milesDriven)
    println(car.owner)
    println("£${car.getCarPrice()}")

    val car2 = ClassConstructor("Ferrari", 2013, 8763.0, 245)
    println(car2.type)
    println(car2.model)
    println(car2.price)
    println(car2.milesDriven)
    println(car2.owner)
    println("£${car2.getCarPrice()}")

}
