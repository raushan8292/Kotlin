

// By default in kotlin every class is final
// if you want to inherit the class use open keyword berfor the class

 open class Human2{

    open fun think(){
         println("Reak Thinking")
     }
 }

class Alien2 : Human2(){  // in koltin as well as multiple inheritance not support and if you want ovveride the method then mention ovveride in fun

    override fun think(){
        println("Thinking about comupter")
    }

}



fun main(){

    var raushan: Human2 = Alien2();
    raushan.think()
}

// if you want make the refrace of humani and creat of object Alien
// then simply write var raushan : Humani = Alien()
// like java Human h = new Aliean();