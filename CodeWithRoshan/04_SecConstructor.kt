
// Secondry Constructor
class Human(var n: String){
 var age:Int = 0
    var name: String = n

    constructor(age:Int, name:String):this(name){

        this.age = age
    }

}

fun main() {
    var raushan = Human(22, "Admi")
    println("The age of Roshan is ${raushan.age} type of ${raushan.name}")

}