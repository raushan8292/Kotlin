package Collection

fun main (){

   // mutableListOf
   val names = mutableListOf("Raushan", "Ramesh", "Ronak", "Rohtak", "Onkar", "Rinku")

   println("1. The number of list in namas ${names.size}")
   println("2. Ramesh is present at  index  of  ${names.indexOf("Ramesh")}")
   println("The value is presnt at 4 index is ${names[4]}")

   names.add("kurkur");

   println(names)

   names.removeAt(2);
   println(names)

   names.remove("Onkar");
   println(names)

   // we can change the value using set function
   names.set(2,"Mar jaa Tu")
   println(names[2])

   // we can also change the value by using index
   names[2] = "Chage kar diya ab theek"
   println(names[2])

   names.clear();
   println(names)




}