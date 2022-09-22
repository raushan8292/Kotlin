fun main(args: Array<String>){

    val number = arrayOf(1,2,3,4,5);

    println("the elemet of second position: ${number.get(1)}")
    println("the elemet of third position: ${number[2]}")

    number.set(3,8);
    number[1] =  6;
    println(number.joinToString(","))

    //Another way to passing the arrays

    val numberZero =  Array(5){0}
    println(numberZero.joinToString(","))



}