package Poo.Enum

enum class Color {
   RED, GREEN, BLUE
}

class Car(val color: Color) {
    fun getColor () {
        println("COLOR IS $color");
    }
}

fun main(args: Array<String>) {
    val car = Car(Color.BLUE);
    car.getColor();
}