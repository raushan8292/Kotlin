fun main(){

    // Range

    print("Line1: ")

    for(i in 1..5) {
        print(" $i,")
    }
    print("\nLine2: ")

if( 4  !in 5..10){

    print("Not There")
}
    print("\nLine3: ")

    for(i in 1 until  5){
        print(" $i," )
    }

    print("\nLine4: ")

    for(i in 4..16 step 2)
        print("$i, ")

    print("\nLine5: ")
    for(i in 5 downTo 5   )
        print("$i, ")

}