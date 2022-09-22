package CodeWithRoshan

interface Human{
    fun think()
}

fun main(args: Array<String>){

    var programmer:Human = object:Human
                            {
                                override fun think()
                                {
                                    println("Virtual thinking...")
                                }
                            }
}