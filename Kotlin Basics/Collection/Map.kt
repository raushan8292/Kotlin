package Collection

fun main(){

    //Map

//    val classRank = mapOf(1 to "Tarun", 2 to "Dinesh", 3 to "Rohit", 4 to "Ramesh")
//    println("1. Student: ${classRank.values}")
//    println("2. Ranks: ${classRank.keys}")
//     println("3. Dinesh has got rank: ${classRank.containsValue("Dinesh")}")
//    println("4. Ramesh is fourth rank : ${classRank.containsKey(4)}")
//    println("5. The student first rank is: ${classRank.get(1)}")

    //classRank.put(5 to "Roshit") // cant be add due to imutable first take mutable

    println(mutable())
}

fun mutable(){

    val classRank2 = mutableMapOf(1 to "Tarun", 2 to "Dinesh", 3 to "Rohit", 4 to "Ramesh")

    classRank2.put(5 , "Ronatry")
    classRank2.remove(2)
    println(classRank2)


}