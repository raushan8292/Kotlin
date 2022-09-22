
fun volume(boxName: String, length:Int, width:Int, height:Int) :Int{

    println(boxName)

    return length * width * height
}

fun main(args: Array<String>){

    //volume("circle", width = 55, length = 53, height = 64); // In kotlin change argument order this type called name argument
   println( volume("Poylogon", 15 ,17 ,78));
}