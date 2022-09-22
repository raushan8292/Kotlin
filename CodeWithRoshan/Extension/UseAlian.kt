package codeWithRsn.Extension

fun main(){
    var a1 = Aliean();
    a1.skills = "Java"
    a1.show()

    var a2 = Aliean()
    a2.skills = "SQL"
    a2.show()



   var a3 = a1.plus(a2)

    a3.show()

}

fun Aliean.plus(a: Aliean): Aliean{

     var newAliean = Aliean()
    newAliean.skills = this.skills + " " + a.skills
    return newAliean


}