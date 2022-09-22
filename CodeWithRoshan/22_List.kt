package CodeWithRoshan

fun main(){

//    var nums : List<Int> = listOf(10,15,17,55)
//    for (i in nums)
//        println(i)

    println("-----------------------")
    // give index they give value
     //println(nums.get(2))

    // give value give index
       //println(nums.indexOf(17))

    // if you want to add value then make list mutable listOf then add method work
    var nums  = mutableListOf(10,15,17,55)
    nums.add(15)
    for (i in nums)
        println(i)
}