
open class Humani(age:Int){

    //called primary constructor
    init {
        println("Called Primary Constructor")
    }
    open fun think(){
        println("Reak Thinking")
    }
}

class Alien(age: Int) : Humani(age){
// In koltin as well as multiple inheritance not support and if you want ovveride the method then mention ovveride in fun
// This type in kotlin pass value throug costructor for super class in java i send the value form super() Keyword
    init{
        println("Called Secondry Constructor")
    }

    override fun think(){
        println("Thinking about comupter")
    }

}



fun main(){

    var raushan: Humani = Alien(20);
   // raushan.think()
}