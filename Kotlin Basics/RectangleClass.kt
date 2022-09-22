class RectangleClass(val height: Double, val width: Double) {

    val parameter = (height + width)*2;

    override fun toString(): String {
        return " parameter: $parameter"
    }


}


fun main(){
    val  rectangle = RectangleClass(5.0,77.8);
    print(rectangle);
}