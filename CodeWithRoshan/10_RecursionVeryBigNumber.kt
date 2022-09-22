

import java.math.BigInteger

fun main(){
    var num:BigInteger = BigInteger("700000")
    println(fact(num,BigInteger.ONE))

}

tailrec fun fact(num:BigInteger,result:BigInteger):BigInteger{

    if(num == BigInteger.ZERO)
        return result
    else {
        return fact(num - BigInteger.ONE, num * result)
    }
}