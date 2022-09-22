
fun main(){
    //NotNull
        printNameLength("Raushan" , "Kumar"); //If i pass null to lastName it gives nullPointer exception cuz where !! not null
                                                  // is last name specifcly mention
    }

fun printNameLength(firstName: String?, lastName: String?){

    if(firstName != null){

        // Not null assertion Operator !!.
    println("Nmae  ${firstName.length} , ${lastName!!.length}") // Here !! is mention means no null  allowed
                                                                // !! its mean also compiler not checking for null



    }
}