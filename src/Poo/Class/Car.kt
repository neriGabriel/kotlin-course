package Poo.Class

//CLASS WITH CONSTRUCTORS
class Person(name: String, age: Int) {
    val name: String;
    var age: Int;

    //BLOCKS OS INITIALIZE, LIKE CONSTRCUTOR IN JAVA
    init {
        this.name = name;
        this.age = age;
    }

    fun getYearOfBirth() = 2020 - this.age;

    fun sayMyName(): String { return this.name; }

    fun greet(name: String) {
        println("Hello ${name}, welcome to POO in kotlin!");
    }

}

fun main(args: Array<String>) {
    val personObject = Person("Gabriel de Oliveira Neri", 22);
    println(personObject.getYearOfBirth());
    println(personObject.sayMyName());
    personObject.greet("Java");
}