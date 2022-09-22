

import java.math.BigInteger

fun main(args:Array<String>){
//    var sc =  Scanner(System.`in`)
//    println("Enter your big factroial")
    var num = BigInteger("70")
    println( fact1(num))
}

fun fact1(num : BigInteger) : BigInteger{

    return if(num == BigInteger.ZERO)
        BigInteger.ONE
    else
        num* fact1(num -  BigInteger.ONE)
}