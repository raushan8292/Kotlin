//Fibonacci Number
//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence
//F(n) = F(n-1) + F(n-2)
//where F(0) = 0 and F(1) = 1
//
//Input Format :
//Integer N
//Output Format :
//true or false
//Constraints :
//0 <= n <= 10^4
//Sample Input 1 :
//5
//Sample Output 1 :
//true
//Sample Input 2 :
//14
//Sample Output 2 :
//false

import  java.util.*;
fun main(args: Array<String>){

    val sc = Scanner(System.`in`);

    var n = sc.nextInt();

    println(isMamber(n))

}

fun isMamber(num:Int): Boolean{
    var a = 0;
    var b = 1;
    while (b < num){

        var c = a +b
        a = b;
        b = c;
    }

    if(b == num || num == 0){
        return true
    }
    return false
}