



class Empty{}


class Automobile (val name:String, val tyres:Int, val maxSeeting: Int, hasAir:Boolean ){

    fun drive(){}
    fun applyBreaks(){}

    override fun toString(): String {
        return "Automobile(name='$name', tyres=$tyres, maxSeeting=$maxSeeting)"
    }

}


// Note if you dont give access modifier then no need to put contructor befor
// like this public constructor(____) insted of (------) simply write if you dont have public private access modifier
class Person constructor(nameParam:String = "Raushan", agePram:Int = 22){

    val name:String = nameParam
    val age:Int = agePram
}

// Primary constructor
fun main(){
    var car = Automobile("farrai", 8,9, true)

    println(car)


    val person = Person("A", 55)
    println( person.age)
    val person2 = Person("B", 33)
    println( person2.name)
}