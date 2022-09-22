package Collection

fun main(args: Array<String>) {

    var x = listOf("Raushan", "Rohit", "Vikash", "rokara do", "mai hu na")
    println("1. The is Size of the list is:  ${x.size}")
    println("2. The second item of the list is: ${x.get(2)}")
    println("3. The second item in the list using index operator  is ${x[3]}")
    println("4. rohit is  at the index  ${x.indexOf("Rohit")} in the list ")


    //x.add("ram") // can't add cuz it is immutable so i can't add int this if you want to add then must use mutable list
}