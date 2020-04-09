package Poo.Class


class Person3 {
    var name: String = "Gabriel Neri";
    var age: Int = 23;

    fun speak() {
        println("Hello, i'm a person and my name is ${this.name}")
    }

    fun greet(name: String) {
        println("Hello ${name}");
    }

    fun getYearOfBirth() = 2020 - age;

}

fun main(args: Array<String>) {
    val objPerson = Person3();

    objPerson.speak();
    objPerson.greet("World");
    println(objPerson.getYearOfBirth());
}