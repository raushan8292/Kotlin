
class A{

    companion object{

        @JvmStatic  // form this method i call this method from java function
        fun show(){
            println("You name is falna")
        }
    }

    fun bhakk(){
        println("Tu jaa re....")
    }
}

fun main(){

    A.show()
    // A.bhakk()// Error without creating object can't call

}