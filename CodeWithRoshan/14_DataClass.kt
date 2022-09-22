
// 1. Every class need toString() method
// 2. need overrid equals & hashCode method when we compare object not refrence address
// 3. copy but in no copy method avilabe so for that before the class mention data then write copy it works
// 4. In data class all method are by default avilable so we no need to override to toString, hashCode,and equals it also have copy method
data class Laptop(val brand:String, val price:Int){

    fun show(){
           println("Awasome Machine...")
    }

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Laptop
//
//        if (brand != other.brand) return false
//        if (price != other.price) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = brand.hashCode()
//        result = 31 * result + price
//        return result
//    }
//
//    override fun toString(): String {
//        return "Laptop(brand='$brand', price=$price)"
//    }


}

fun main(args: Array<String>){

    val lap1: Laptop = Laptop("Dell", 2000)
//    val lap2: Laptop = Laptop("Dell", 2000)
    val lap2: Laptop = Laptop("Apple", 2500)
    val lap3 = lap1.copy(price = 2500) // if you want to same name but price will change you can do it if dont then empty-> ()

    println(lap1)

    println(lap1.equals(lap2)) // same (lap1 == lap2)
    println(lap3 )
    println(lap3 == lap1 )

}


