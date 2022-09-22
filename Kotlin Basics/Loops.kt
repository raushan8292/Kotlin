fun main (args: Array<String>){

    // for loop
    val names   = arrayOf(1, 2, 3, 4);

    for(name in names ) {
        println(name)
    }

     // for String

    val names1  = arrayOf("Ram", "Raushan", "Rohit")

    for(name in names1){
        println(name)
    }

    for(i in names.indices){
        print(names[i])
        print(",")
    }

    



}


