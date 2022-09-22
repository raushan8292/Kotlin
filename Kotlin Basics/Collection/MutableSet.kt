package Collection

fun main(){
    // MutableSetOf of Collection
    val x = mutableSetOf("Titu", "Bittu", "Avinash", "Hitendra", "Rohit", "Deevanshu", "Rohit");
    println(x)
    println(x.size)
    x.add("Kuku");
    println(x)

    x.remove("Bittu");
    println(x)
}