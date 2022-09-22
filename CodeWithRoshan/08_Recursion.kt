

import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    println("Enter your number Here n")
    var num: Int =   sc.nextInt();

    print(fact(num))
}

fun fact(num:Int):Int{

    if(num==0)
        return 1;

    else
      return  num * fact(num-1) // 5 * 4! -> 4 * 3!


}