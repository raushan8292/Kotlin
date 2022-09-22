package CodeWithRoshan

data class  Aliean (var name:String, var age:Int)

fun main(){

//    var value: MutableList<String> = mutableListOf<String>("Raushan", "Rameswar", "Rohit", "Jeneey")
//    value.add("Sanjan")
//    for (i in value)
//        println(i)

    // How van add the value in my object type

    var value: List<Aliean> = listOf<Aliean> (
        Aliean("Raushan",  25),
        Aliean("Rajan", 23),
        Aliean("Rohit", 29)
    )

    for (i in value)
        println(i)

}