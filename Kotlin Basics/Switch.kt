package When

fun main(){

    //Switch / When

    val rating = 5;
    val result = when(rating){

        5 ->  { println("Thank you Viewer"); "High"} // if you write in same line the must seprate form ; this type
        3, 4->  "Good"
        1, 2 ->  "Poor"


        else -> {
            println("no rating") // Here no ; need cuz line is diffrent
            "Zero"
        }
    }

    print("Your result is $result")
}

