fun main(args:Array<String>){
     printUserName1("Raushan","Kumar") // here i pass both value then last string is override
    printUserName1("Raushan")    // here i didn't pass last value so default value run
}
                                                 // here👇👇👇 if user not pass any value form main fun then it will set dafault value chauhan
fun printUserName1(firstName: String, lastNmae:String="chauhan"){

    println("The first name is $firstName and lastName is $lastNmae")

}