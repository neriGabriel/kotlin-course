package Poo.OpenClassInheritance


open class Person(open val name: String, open val age: Int) {
    init {}

    fun speak() {
        println("Hello");
    }

    fun greet(name: String) {
        println("Hello $name");
    }

    fun getYearOfBirth() = 2020 - age;
}

class Student(override val name: String, override val age: Int, val id: Long): Person(name, age) {
    fun getId() {
        println(id);
    }
}

class Employee(override val name: String, override val age: Int ): Person(name, age)  {

}

fun main(args: Array<String>) {
    val student = Student("Gabriel", 22, 45497834);
    student.speak();
    student.getId();
}