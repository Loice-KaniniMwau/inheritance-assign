fun main() {
var car1=Car("subaru","legacy","white",40)
    car1.carry(50)
    car1.identity()
    println(car1.calculateParkingFess(4))
    var bus1=Bus("Nissan","corolla","blue",36)
    bus1.carry(40)
    bus1.identity()
    println(bus1.calculateParkingFess(4))
    println( bus1.maxTripFare(300.0))


}
open class Vehicles(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people:Int) {
     var x=people-capacity
        if (people<=capacity)
            println("carrying $people passengers")
        else {
            println("over-capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFess(hours:Int):Int{
        var parkingFees=hours * 20
        return parkingFees
    }
}
class Car(make:String,model:String, color:String, capacity:Int):Vehicles(make, model, color, capacity){


}

class Bus(make:String,model:String, color:String, capacity:Int):Vehicles(make, model, color, capacity){
fun maxTripFare(fare:Double):Double{
    return fare.times(capacity)




}

    override fun calculateParkingFess(hours: Int): Int {
        var parkingfess=hours * capacity
        return parkingfess
    }
}