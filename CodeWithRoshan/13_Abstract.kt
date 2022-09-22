

abstract class fan{

     abstract  fun features()

     // we can also define method in abstract class

     fun wings(){
         println("They have four wings")
     }
}


 class  sellingFan : fan(){

     override fun features() {
         println("They gives also air but all around the room")
     }
//     override fun wings(){
//         println()
//     }
     // we can't override the method because of abstract method is final method so we can't override
 }

fun main(){

    var roxyFan:fan = sellingFan()
    roxyFan.features()
    roxyFan.wings()
}