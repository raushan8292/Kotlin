fun main(){
    //var is a keyword which is changeable

    /* var x : Int = 5;
     println("this is first value $x");*/

    //val is a keyword which is not changeable
    /* val y : String = "Raushan";

    println("My name is ${y.uppercase()}");*/


    //check nullInput Expection
    //
    /*val myName: String? = null;

    if(myName != null){

        println(myName);
    } */

    // if we want assign any value by checking any condition then i can simply do it
    //
    /* val value: Int = if(true){
         println("Inside true")

         10
     }else{
         20
     }

     println(value); */

    //when is similar to switch case satement;

    /* val name = "gam"
     val g =   when(name){
              "Raushan" -> {
                  println("Awasome");
              }

              "Rajan" -> {
                  println("Must tilented")
              }

              "Doctor" ->{

                  println("she is lady of luck")
              }

              //Like default
              else ->{
                  println ("I found Nothing your case")
              }
        }*/

// println(g);

// Arrays in Kotlin

    /* val names = arrayOf("Raushan ", "Mohit ", "Gookek ", "Rohit");


        for(name in names){

            println(name)
        }

        names.forEach{
            print(it)
        }*/


//ranges in kotlin

    /* for(i in 0..3){

        print(i)
    }
    print(" ")

    for(i in 2..8 step 2){
        print(i)
    }
    print(" ")

    for(i in 3 downTo 0){
        print(i)
    }

    } */

// Searching Element in list
    /*
     val x = 6;

     if(x in 1..6){
       print("Value is avilable int the given List") ;
     }else{
         println("data is not found ")
     }

     if(x !in 1..6){
         print("Yess you are right data is not avilable")
     }*/



}