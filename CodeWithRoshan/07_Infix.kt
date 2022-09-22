
import codeWithRsn.Extension.Aliean
 class  Aliean {

    var skills:String? = null

    fun show() {
        println(skills)
    }

}



fun main(){
    var a1 = Aliean();
    a1.skills = "Java"
    a1.show()

    var a2 = Aliean()
    a2.skills = "SQL"
    a2.show()



   // var a3 = a1 plus a2
    // if you want call form the operator if you write + then if you want call plus then you shoul write after the infix operator after call
    var a3 = a1 + a2
    a3.show()

}

// infix work with only with one prameter ex :- down in is are infix function
// your can also can the function useing operator overloading using operator keyword

infix operator fun Aliean.plus(a: Aliean): Aliean {

    var newAliean = Aliean()
    newAliean.skills = this.skills + " " + a.skills
    return newAliean


}