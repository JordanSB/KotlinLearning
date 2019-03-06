import com.car.maintain.ClassConstructor
import com.example.cars.MyCar

fun main(){

    // Importing class from com.example.cars.MyCar
    var myClass = MyCar()
    myClass.ShowInfo()

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
