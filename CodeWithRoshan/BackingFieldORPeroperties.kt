import Classes.Person

fun main (){

    var person = Person("Rashan", 55)
    person.name = "Hoyu"
    person.age = 33
    println(person.name)
    println(person.age)
}

class  Personn(name:String, age:Int){

    // Backing Field

    var name:String = name
        get() = field.uppercase();
        set(value) {
            field = if(value == "Raushan") {
               println("Chutiya Hai Tu")
                "Raam"
            }
            else {
                println("Bhai mai hu")
                "Chauhan"
            }
        }

        // Backing properties concept

    private  val _age:Int = age

    val age: Int
        get() = _age
}