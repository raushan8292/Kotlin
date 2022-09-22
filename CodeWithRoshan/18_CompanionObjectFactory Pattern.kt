package CodeWithRoshan


class Z{

    companion object {

        fun create(): Z = Z()
    }

    fun show(){
       println("in show")
    }
}

fun main(){

    var x = Z.create();

    x.show()
}