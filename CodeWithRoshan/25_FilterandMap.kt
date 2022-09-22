package CodeWithRoshan

data class Aliea (var name: String, var points:Int)

fun main(){

    var value = listOf<Int>(10,25,35,85)

    // it filter the value if you want find even number then use filter and it means the current value
 //   var evens = value.filter { it % 2 == 0 }

    // it change the value if you want find double the value then use map  and it *2  means the current value into 2;
  //  var doubleVlue = evens.map{ it * 2 }

    // doubleVlue.forEach(::println)

    // instead of two line we simply write one line

    var result = value
                      .filter { it % 2 == 0 }
                      .map { it * 2 }

    result.forEach(::println)
}