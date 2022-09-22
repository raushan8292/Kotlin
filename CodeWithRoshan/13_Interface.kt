package CodeWithRoshan

interface A {

    fun show()

    // pehla kya the ki interface bana k bade app fun nai bna skte the per sare class mai define karna hota the nai to error aata the
    // but after java 8 ham interface mai  fun bna skte hai but difine bhi wahi karna hoga nai to error aaya ge

    fun out(){
        println("The is out class A " )
    }
}

interface B {

    fun display()
    fun out(){
        println("The is out class B")
    }
}

class C : A, B{

 // agar dono class k pass same fun hai to or override kiya hai to apko yha pe o fun override karna hoga
    // nai to ambigty issue aaya gi
    override fun show() {
        println("implemented A ")
    }

    override fun display() {
        println("implemented b")
    }

    override fun out() {
        // if you call super but you only write super then also got ambiguty issume so write this type
        super<A>.out()
        //println("This is out method in class c")
    }
}

fun main(){
    var imp : C = C()
    imp.display()
    imp.show()
    imp.out()
}