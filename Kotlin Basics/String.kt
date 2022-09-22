fun String(){



}


fun main(args: Array<String>){

               //      part 1 L

//    val  name: String = "Raushan" + "Kumar";
//    println(name)
//
//    val  strNum: String = "Chauhan" + 20;
//    println(strNum)

    // But be careFull if you concinate the String and Int then first write String not Int okk..

    // val wrongType: String = 40 + "Raushan"  // It throws error


                   // part 2 L

     // String Templete

     val  faltNumber: String = "The house number is " + 24;
    println(faltNumber);


    // second way

    val flatNumber1: Int = 12;
    val flatNumber2: String = "This House number is $flatNumber1"
    println(flatNumber2)

    // Third way

    val name8: String = "Raushan" + "Kumar"
     println("your name length ${name8.length}  character long");
    
}