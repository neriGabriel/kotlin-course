package Poo.Interface

interface Driveable {
    fun drive() {}
}

interface Buildable {
    val timeRequired: Int;
    fun build() {}
}

class Carro(val color: String): Driveable, Buildable {
    override val timeRequired = 120;

    override fun drive() {
        println("I'm driving a car!, this is finished in $timeRequired seconds");
    }

    override fun build() {
        println("I'm building the car!");
    }
}

fun main(args: Array<String>) {
    var car = Carro("Azul");
    car.build();
    car.drive();
}