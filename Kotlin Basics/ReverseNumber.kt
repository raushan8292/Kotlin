//Reverse Number Pattern
//
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//21
//321
//4321
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//1
//21
//321
//4321
//54321
//Sample Input 2:
//6
//Sample Output 2:
//1
//21
//321
//4321
//54321
//654321

import java.util.Scanner

fun main(args:Array<String>){

    val sc = Scanner(System.`in`);
     println("Enter your number")
    var n = sc.nextInt();



//    for(i in 1..n){
//        for (j in i downTo 1){
//
//            print(j)
//        }
//        println()
//    }

    // Second Way to Solve find for each

    (1..n).forEach{ x ->
        (x downTo 1).forEach{ print("$it") }
        println()
    }


}
