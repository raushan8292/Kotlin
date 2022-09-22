fun main(){
    var x : String = "Raushan Kumar";
    println("The length of $x " + x.length);
    //if we want to put null in our variable then we put ? after data type otherWise it gives error;
       var y: String? = null;

    //safe call Operator ? ..
    // if you wirte y.length then it gives error
     println(y?.length); // output -- null

    // Elvis Operator  ?:
    println(y?.length ?: 0); //output -- 0



}


