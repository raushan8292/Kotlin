package codeWithRsn

import kotlin.math.pow

fun main(){

    var fn = ::addintion
    println(fn(17.6,16.55))

    fn = ::power
    println(fn(2.0,5.0))

}

fun  addintion(a:Double, b:Double):Double{

    return a +b;
}

fun power(a:Double, b:Double):Double{

    return a.pow(b);
}