package Poo.Class

class Person2 {
    var name: String = "Gabriel";
    var age: Int = 22;
}

fun main(args: Array<String>) {
    val person = Person2();
    println(person.name);
    println(person.age);

    person.name = "Gabriel de Oliveira Neri";

    println(person.name);
    println(person.age);
}