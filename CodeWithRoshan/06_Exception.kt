

import java.lang.NumberFormatException

fun main(){
// if x have come null so i put ? marks other wise when we put or comes null it can't be assign so that
//    var x: String? = "5"
//    var y =  x ?: "Kutta"
//    println(y)



    // Exception

    var x:String = "4a"

//    var y:Int = 0;
//    try {
//        y = x.toInt()
//
//    }catch (e:NumberFormatException){
//        println("Enter Right rite  input")
//    }
//    finally {
//        y++;
//    }

    // but in kotlin we can assign this type  also

    var y:Int = try {
         x.toInt()

    }catch (e:NumberFormatException){
        println("value assigened right")
       -1
    }

    y++
    println(y)



}