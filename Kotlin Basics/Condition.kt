fun main (){
    //if // else

    var  Discount = 0;
    val  price = 85;

    if(price > 50){

        Discount = 10;

    }else{
        Discount = 3;
    }

    println(Discount)

      // Another Way

    Discount = if(price > 50) 10 else 3

    print(Discount)

}