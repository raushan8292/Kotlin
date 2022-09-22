package CodeWithRoshan

fun main (){

    var value = mutableListOf<String>(

        "Rajan" , "Roshan" , "Manish" , "Rohan", "Ronak", "Rupak",
        "Manuju" , "Sanju", "Sita", "Sarita" , "Roshika"
    )

//    value.forEach(
//        {
//            println(it)
//        }
//    )

    // insted  of those thing  we simply write :: print :: method refrence function refrence

    value.forEach(::println)



}