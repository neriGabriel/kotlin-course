package Poo.AbstractClass


abstract class Person(open val name: String, open val age: Int) {
    init {}

    abstract fun speak()

    abstract fun greet(name: String)

    fun getYearOfBirth() = 2020 - age;
}


class Employee(override val name: String, override val age: Int ): Person(name, age)  {
    fun receivePayment() {
        println("Payment recived!");
    }

    override fun speak() {
        println("Hi there i'm an employee");
    }

    override fun greet(name: String) {
        println("Hello $name, i'm an employee");
    }
}


fun main(args: Array<String>) {
   var employee = Employee("Gabriel Neri", 22);

    employee.receivePayment();
    employee.greet("Boss");
    employee.speak()
}