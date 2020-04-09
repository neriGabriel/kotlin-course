package Poo.NamedParamsDefaultValue

class House(val height: Double, val color: String, val price: Int) {
    fun print() {
        println("House [height=$height, color=$color, price=$price]");
    }
}

fun main(args: Array<String>) {
    val house = House(height=5.5, color="Red", price=156000);
    val house2 = House(color="Green", height = 65.65, price=9899999);
    house.print()
    house2.print()
}