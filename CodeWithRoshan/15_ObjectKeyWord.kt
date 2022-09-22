
 data class  Book( val name:String, val price:Int )

 // yha per object class ka bnya gya hai confuse nai hona hai companian object fun mai krta hai static wla feature pna k lya (See in next code 17)
// ye kiya is liya ki class ka object na bnana pare or companian wla karta hai taki class k namm se call kar sake static ki trah
 object  BookShelf{

     var books = arrayListOf<Book>()

     fun showBooks(){
         for (i in books){
             println(i)
         }
     }


 }

 fun main(args: Array<String>){

     BookShelf.books.add(Book("java",50))
     BookShelf.books.add(Book("Mysql",60))
     BookShelf.books.add(Book("Kotlin",80))

     BookShelf.showBooks()



 }