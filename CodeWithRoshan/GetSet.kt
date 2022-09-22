fun main (){
    val person = person(firstName = "Raushan", age = 55, "Engineer")
    println(person.firstName)
   println(person.age)
    println(person.perofassion)

    person.age = 95
    println(person.age)
}

class person(firstName:String, age:Int,  private var _perofassion:String){

    var perofassion:String = _perofassion
        get() = _perofassion.uppercase()

    val  firstName:String = firstName
        get() = field


    var age:Int = age
        get()  {
            print("Getter is called")
           return field
        }

        set(value){

            println("Setter is called ")

            field = if (value < 18 )
                18
            else if (value > 18 && value < 35)
                value
            else
                value - 5


        }



}